package Array;
//��ά����  �������е����飩
public class Twodimensional_Array {
	public static void main(String[] args) {
	int data [] []=new int [] []{
			{1,2,3,4,5},{1,2,3},{4,5,6,7,8,9}
	};
	for(int temp[] : data){    //foreach�����ά����  
		for(int num : temp){
			System.out.print(num+"��");
		}
		System.out.println();
	}
	
//	for(int i=0;i<data.length;i++){
//		for(int j=0;j<data[i].length;j++){
//			System.out.println("data["+i+"] ["+j+"] ="+data[i][j]);
//		}
//		System.out.println();    //����
//	}
	}

}
