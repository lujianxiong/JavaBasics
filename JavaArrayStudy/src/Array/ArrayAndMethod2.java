package Array;
//ͨ�������޸���������
public class ArrayAndMethod2 {
	public static void main(String[] args) {
		int data [] = new int[] {1,2,3,4,5};
		changeArray(data);    //�޸���������
		printArray(data);     //��������

	}
	public static void changeArray(int arr[]){
		// changeArray ����������ͽ����ˣ�arr����ʧ�ˣ�
		for(int i=0;i<arr.length;i++){
			arr[i]*=2;       //ÿ��Ԫ�ص����ݳ�2����
		}
	}
	public static void printArray(int temp []){
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
	}
}
