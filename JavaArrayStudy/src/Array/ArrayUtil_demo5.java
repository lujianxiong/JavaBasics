package Array;
//���߽ڣ�����ת�ù�����
public class ArrayUtil_demo5 {
	public static void reverse(int data []){
		int center=data.length/2;   //ȷ��ת���Ĵ���
		int head=0;   //�����ű�
		int tail=data.length-1;  //�����ű�
		for(int i=0;i<center;i++){
			int temp =data [head];
			data [head] =data [tail];
			data [tail] =temp;
			head++;
			tail--;
		}
	}
	public static void printArray(int temp []){
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");
		}
		System.out.println();
	}
}
