package String������ʵ��������;
//�۲칹�췽��ʵ����String�����ʱ�ĳز���
public class Stringdemo2 {
	public static void main(String[] args) {
		String strA = "baidu";           //��� 
		String strB = new String("baidu");     //�����
		String strC = new String("baidu").intern();
		System.out.println(strA == strB);  //false
		System.out.println(strA == strC);  //true

	}

}
