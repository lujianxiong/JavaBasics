package Array;
//���鷴ת1������һ���µ��������������ķ�ʽ����
public class Arraydemo5 {
	public static void main(String[] args) {
		int data []=new int [] {1,2,3,4,5,6,7,8,9};
		int temp []=new int [data.length] ;
		int foot = temp.length-1;    //�ڶ�������ĽǱ�
		for(int i=0;i<data.length;i++){
			temp[foot--]=data[i];   //����ǹؼ����룻ͨ��i����data����Ǳ꣬�����ν�data��������temp���з�ת����
		}
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");
		}
	}
}
