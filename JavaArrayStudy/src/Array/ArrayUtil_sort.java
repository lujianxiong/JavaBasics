package Array;
//������ ��������
public class ArrayUtil_sort {        //������������
	public static void sort(int data[]){
		//����static����ͨ��������������
		for(int x=0;x<data.length-1;x++){
			for(int y=0;y<data.length-x-1;y++){
				if(data[y]>data[y+1]){    //��������
				int temp=data[y+1];
				data[y+1]=data[y];
				data[y]=temp;
				}
			}
		}
	}
	public static void printArray(int temp []){
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");
		}
		System.out.println();
	}
}
