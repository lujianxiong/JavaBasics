package Array;
//��ʱ������ͺñ�����ʹ�õ���һ����ֻ������β�����������Ĳ������̱�����а�װ�ˡ�
public class ArrayUtil {   //��һ������������
	private int sum;     //�����ܺ�
	private double avg;    //����ƽ��ֵ 
	private int max;      //�������ֵ
	private int min;      //������Сֵ
	
	public ArrayUtil(int data []){    //�����������
		this.max =data [0];  //�����һ�������ֵ
		this.min =data [0];  //�����һ������Сֵ
		for(int i=0;i<data.length;i++){
			if(data[i]>max){
				max=data [i];
			}
			if(data [i]<min){
				min=data [i];
			}
			sum+=data [i];
		}
		this.avg = this.sum/data.length;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}

}
