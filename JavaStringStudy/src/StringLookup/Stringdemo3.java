package StringLookup;
//��ʮ���ڣ��ַ������ң�
//ʹ��lastIndexOf()����
public class Stringdemo3 {
	public static void main(String[] args) {
		String str = "www.baidu.com";
		System.out.println(str.lastIndexOf(".")); 
		//�Ӻ���ǰ�飬�鵽���ǵڶ�����.������˷��ص���9
		
		System.out.println(str.lastIndexOf(".",5));
		//�ӵ����λ�ôӺ���ǰ�飬��˲鵽���ǵ�һ����.�������ص���3
	}

}
