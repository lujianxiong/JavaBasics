package Array;
//���ⶨ��һ��int���飬Ҫ����Լ�����������Ԫ�ص��ܺͣ����ֵ����Сֵ��ƽ��ֵ��
public class Arraydemo4 {
	public static void main(String[] args) {
		int data []=new int [] {1,2,3,4,5};
		ArrayUtil util= new ArrayUtil(data);    //�������ݼ���
		
		System.out.println("���������ܺͣ�"+util.getSum());
		System.out.println("��������ƽ��ֵ��"+util.getAvg());
		System.out.println("�����������ֵ��"+util.getMax());
		System.out.println("����������Сֵ��"+util.getMin());
	}
}
