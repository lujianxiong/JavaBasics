package Object����;
//��ʮ�߽� Object���飺
//Object������������
public class Javademo {
	public static void main(String[] args) {
		Object obj = new Person();   //����ת��
		if(obj instanceof Person){   //�ж�ʵ���Ƿ���Person�������������ת��ʱ�����
			Person per = (Person) obj;  //����ת��
			System.out.println("Person��������ת��ִ�����");
		}
	}

}
