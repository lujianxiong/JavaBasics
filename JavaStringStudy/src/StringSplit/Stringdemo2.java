package StringSplit;
//��ʮ�Ľ� �ַ�����֣�
//����ƶ�����
public class Stringdemo2 {
	public static void main(String[] args) {
		String str = "hello world hello baidu";
		String result [] = str.split(" ",2);  //���տո��֣�������������ַ���������󳤶�Ϊ2��
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}
}
