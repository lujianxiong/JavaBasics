package String��������;
//����ʱ������
public class Stringdemo2 {
	public static void main(String[] args) {
		 String info = "mldn";
		 String strA = "www.mldn";
		 String strB = "www."+info+".cn";
		 //֮������һ��false������Ϊ�����ڼ��ص�ʱ�򲢲�ȷ��info��ʲô���ݡ�
		 //������ص�ʱ������ַ�������info���õ��Ǳ����������������ǿ����޸ĵģ�
		 //����������Ϊ���յ�strB�Ľ������һ������Ҫ�����յĽ��
		 System.out.println(strA == strB); 
		 //�����strB�����������ʱ��������ȥ�ˣ�û�ø���strA�����Ե�ַ��һ����
	}
}
