package final�ؼ���;
//�ڰ˽� final�ؼ���
public class demo {
	public static void main(String[] args) {
		// String info = "baidu";  //false
		final String info = "baidu";   //true
		String strA = "www.baidu.com";
		String strB = "www."+info+".com";
		System.out.println(strA == strB);     //info����final��info��strB��ɳ�����
		//�ڷ����п���ʹ��final�������������ʱҲ��ʾ����
	}

}
