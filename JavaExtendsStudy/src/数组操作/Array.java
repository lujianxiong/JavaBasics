package �������;
//�ڶ�ʮ���� ���������
//���������
public class Array {
	private int[] data; //��������
	private int foot;  //����������������
	
	//���췽����������
	public Array(int len){
		if(len>0){
			this.data = new int[len];  //����len��������
		}else{
			this.data = new int[1];  //���븺ֵʱ����һ���ռ䣨��ֹ����
		}
	}
	
	//ʵ���������������(�������������С��ʵ�ʴ�С = ���д�С+�����С)
	//�������������ǳ����ǹ̶��ģ���Ҳ�������ȱ������
	public void increment(int num){
		int newData[] = new int [this.data.length+num];
		System.arraycopy(this.data,0,newData,0,this.data.length);
		this.data = newData;  //�ı���������		
	}
	
	//ʵ����������
	public boolean add(int num){   
		if(this.foot<this.data.length){  //��λ��
			this.data[this.foot++] =num;   // �������num���ݴ浽��ǰ��������һ������
			return true;
		}
		return false;
	}
	
	public int[] getData(){
		return this.data;
	}

}
