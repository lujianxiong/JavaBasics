package Array;
//�����뷽����ͨ���������ô������飩
public class ArrayAndMethod {
	public static void main(String[] args) {
		int data []= initArray();       //ͨ�����������������
		/*��ʼ����ʱ�򣺵���initArray��������ջ�ڴ濪��һ���ռ�arr��arr��ַָ����ڴ�����int������
		 * ����ջ�ڴ��ڿ���һ���ռ�data��dataͬ��ָ�����int�����ݡ�
		*/
		printArray(data);    //��������
		//����printArray��������ջ�ڴ濪��һ��temp�ռ䣬��data��ָ��ĸ���temp��tempͬ��ָ�����int������

	}
	public static int [] initArray(){
		int arr [] = new int [] {1,2,3,4,5};    //��ֵ
		return arr;              //����һ������
		//return new int [] {1,2,3,4,5};     ����ɣ������������ĺϳɣ�
		//return {1,2,3,4,5};      //���ּ���������
	}
	//Ҫ�����һ��int�͵�����
	public static void printArray(int temp []){
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
	}
}
