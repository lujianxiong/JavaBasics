package StringLookup;
//��ʮ���ڣ��ַ������ң�
//�ж��Ƿ���ָ���ַ�����ͷ���β��startsWith��endsWith
//�Ժ󿪷��кܶ���ƶ���Ҫ����֧��
public class Stringdemo4 {
	public static void main(String[] args) {
		String str = "**@@www.baidu.com##";
		//�ж��Ƿ��ԡ�**�����ſ�ͷ
		System.out.println(str.startsWith("**"));
		//�ж��Ƿ��ԡ�##�����Ž�β
		System.out.println(str.endsWith("##"));
		//�ӵڶ�����ʼ�ж��Ƿ��ԡ�@@�����ſ�ͷ
		System.out.println(str.startsWith("@@", 2));
	}

}
