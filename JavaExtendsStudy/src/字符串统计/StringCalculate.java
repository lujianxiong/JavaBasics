package �ַ���ͳ��;
//�ڶ�ʮ���� �ַ���ͳ�ƣ�
//����һ�������Ĵ�����
public class StringCalculate {
	//���صĵ�һ������Ϊ��ĸn�ĸ������ڶ�������Ϊ��ĸo�ĸ���
	public static int[] count(String str){
		int countData [] = new int [2];
		char[] data = str.toCharArray();   //���ַ�����Ϊ�ַ�����
		for(int x=0;x<data.length;x++){
			if(data[x] == 'n'|| data[x] == 'N'){
				countData[0]++;
			}
			if(data[x] == 'o'|| data[x] == 'O'){
				countData[1]++;
			}
		}
		return countData;
	}
}
