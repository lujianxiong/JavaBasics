package ArrayLibrarySupport;

public class ArrayCopy {

	public static void main(String[] args) {
		int dataA [] = new int [] {1,2,3,4,5,6,7,8,9};
		int dataB [] = new int [] {11,22,33,44,55,66,77,88,99};
		System.out.print("Դ���飺");
		ArrayUtil.printArray(dataA);
		System.out.print("Ŀ�����飺");
		ArrayUtil.printArray(dataB); 
		ArrayUtil.arraycopy(dataA, 4, dataB, 4, 3);  //�Զ���ķ�������java�Դ���ʵ����ͬ��Ч��
		//System.arraycopy(dataA, 4, dataB, 4, 3);    javaϵͳ�Դ��ķ���
		System.out.print("��Դ���鿽���ĵ��������ʼ����3������Ŀ��������������");
		ArrayUtil.printArray(dataB);
		

	}

}
