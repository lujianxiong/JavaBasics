package ArrayLibrarySupport;
//������
public class ArrayUtil {

	public static void printArray(int temp []){
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");
		}
		System.out.println();
	}
	//�Զ���һ��copy�ķ���
	public static void arraycopy(int [] src,int sindex,
			int dsc [],int dindex,int length){
		for(int i=0;i<length;i++){
			dsc[dindex++]=src[sindex++];
		}
		
	}
	
}
