package StringSplit;
//��ʮ�Ľ� �ַ�����֣�
//ȫ����֣���һ���ַ�������ĳ��������в��Ϊ�ַ�������
public class Stringdemo1 {
	public static void main(String[] args) {
		String str = "hello world hello baidu";
		String result [] = str.split(" ");  //���տո���
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

}
