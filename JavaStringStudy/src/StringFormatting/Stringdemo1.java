package StringFormatting;
//��ʮ���� �ַ�����ʽ�� �����
//��ʽ������
public class Stringdemo1 {
	public static void main(String[] args) {
		String name = "����";
		int age = 18;
		double score = 98.7654321;
		String str = String.format("������%s�� ���䣺%d�� �ɼ���%5.2f", name,age,score);
		//5.2f��5���ܹ������ݣ�2��С��
		System.out.println(str);
	}

}
