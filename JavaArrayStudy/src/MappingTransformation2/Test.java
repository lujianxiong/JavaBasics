package MappingTransformation2;

public class Test {

	public static void main(String[] args) {
		//��һ�������ݽṹ���ö������ݣ�
		Item item= new Item(1L,"ͼ��");
		SubItem subitem [] = new SubItem [] {
				new SubItem(10L,"���ͼ��"),
				new SubItem(10L,"ͼ��ͼ����ͼ��"),
		};
		item.setSubitem(subitem);    //һ���������ж���ӷ���
		for(int i=0;i<subitem.length;i++){
			subitem[i].setItem(item);
		}
		//�ڶ���:����Ҫ���ȡ����
		System.out.println(item.getInfo());
		for(int i=0;i<item.getSubitem().length;i++){
			System.out.println("\t|-"+item.getSubitem()[i].getInfo());
		}

	}

}
