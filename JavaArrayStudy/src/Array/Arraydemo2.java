package Array;
//�������ô���
public class Arraydemo2 {

	public static void main(String[] args) {
		int data []=new int []{12,23,34};  //��̬��ʼ��
		int temp []=data;      //���ô���
		temp [0]=99;
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
	}
}
