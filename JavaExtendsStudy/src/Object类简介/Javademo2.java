package Object����;
//��ʮ�߽� Object���飺
//ʹ��Object���������(��������)
public class Javademo2 {
	public static void main(String[] args) {
		Object obj = new int[] {1,2,3};  //����ת��
		if(obj instanceof int[]){   //�ж��Ƿ�Ϊ��������
			int data [] = (int[])obj;  //����ת��
			for(int temp:data){
				System.out.print(temp+"��");
			}
		}
	}

}
