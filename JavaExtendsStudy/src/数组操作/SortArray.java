package �������;

//������������
public class SortArray extends Array{

	public SortArray(int len) {
		super(len);  //����û���޲ι��죬��ȷ�����вι���
	}
	
	//��д����ʵ������
	public int[] getData(){  //���������
		java.util.Arrays.sort(super.getData());  //����javaϵͳ�����򷽷���������
		return super.getData();
	}
	
}
