package StringSplit;
//��ʮ�Ľ� �ַ�����֣�
//��ֲ��˵����
public class Stringdemo3 {
	public static void main(String[] args) {
		String str = "192.168.1.2";
		String result [] = str.split("\\.");  //���տո���  (��ֲ��˽���ת�壡������)
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

}
