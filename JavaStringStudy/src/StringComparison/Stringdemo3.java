package StringComparison;
//��ʮһ�ڣ��ַ����Ƚϣ�public int compareTo (String anotherString)
//�÷����᷵��һ��int���ݣ�������������ȡֵ�����ڣ�>0����С�ڣ�<0�������ڣ�=0��
public class Stringdemo3 {
	public static void main(String[] args) {
		String strA = "m";
		String strB = "M";
		String strC = "baidu";
		String strD = "baidU";
		System.out.println(strB.compareTo(strA));   
		//strA.compareTo(strB)���32,�൱��m-M���������ߵĲ�
		//A��B����λ�ã��������-32
		System.out.println(strC.compareTo(strD));   //���32	
		//ǰ��baid��ͬ���Ͳ����ˣ�u��U����ASCLL�����
		System.out.println("HELLO".compareTo("HELLO"));  //���0

	}

}
