package �ַ�������;
//����һ���ַ���ƥ��������
//�û��������ݽ���ƥ�䣬�����û������в����룬����Ϊ�գ��Ϳ��ܳ��ֿ�ָ�������
public class Stringdemo2 {

	public static void main(String[] args) {
		String input = null;  //�û����������
//		System.out.println(input.equals("baidu"));  //�ַ��������ں��������� ERROR����ָ���쳣�� java.lang.NullPointerException
		System.out.println("baidu".equals(input));  //�ַ���������ǰ��������
		//equals()���������ṩ��һ�����Իر�null���жϣ�������ַ�������д��ǰ�棬��ô����equals()������ʱ��
		//��Զ�������ܳ��֡�NullPointerException�����ַ���������һ������������������һ���ǿ��ٺö��ڴ�ռ�Ķ���
	}

}
