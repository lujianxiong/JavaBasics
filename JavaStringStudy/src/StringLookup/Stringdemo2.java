package StringLookup;
//��ʮ���ڣ��ַ������ң�֮�ж��ַ����Ƿ����
//�ж����ַ����Ƿ����:public boolean indexOf(String str)
public class Stringdemo2 {
	public static void main(String[] args) {
		String str = "www.baidu.com";
		System.out.println(str.indexOf("baidu"));  //���4  4��ʾ4����str�е�5��λ�ÿ�ʼ��(��0��ʼ��)
		System.out.println(str.indexOf("hello"));  //���-1 -1��ָû�в鵽
		//��JDK1.5֮ǰ���Ҫ��ѯ��������ֻ�ܹ�����indexOf()���������
		if(str.indexOf("baidu")!=-1)
			System.out.println("���ݴ���!");
		//��contains���,���������������
		//indexOf������Ҫ�Ȳ���λ��,�ڽ��д���
		//indexOf������Ϊ�˽������ַ���λ�õĲ�ѯ���ڿ���֮�����ǿ������ô���ʽ����һЩ������λ�õ�ȷ��
	}

}
