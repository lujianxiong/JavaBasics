package StringReplace;
//��ʮ���� �ַ����滻��
//replaceAll��replaceFirst��ʹ��
public class Stringdemo1 {
	public static void main(String[] args) {
		String str = "helloworld";
		System.out.println(str.replaceAll("l", "X"));  //�滻ȫ��
		System.out.println(str.replaceFirst("l", "X"));  //�滻�׸�
	}
}
