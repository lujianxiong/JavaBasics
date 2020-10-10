package �������;

//���巴ת����
public class ReverseArray extends Array{

	public ReverseArray(int len) {
		super(len);
	}
	
	public int[] getData(){
		int center = super.getData().length/2;
		int head = 0;    //��
		int tail = super.getData().length-1;   //β
		for(int x =0;x<center;x++){
			int temp = super.getData()[head];
			super.getData()[head] = super.getData()[tail];
			super.getData()[tail] = temp;
			head++;
			tail--;
		}
		return super.getData();
	}
	
}
