package Reference_application;
//��11�� ������ṹ�����ô��ݵ�ʵ��Ӧ�ã�

//�����е��˿�����һ���������е���û��������ֻ��11·������ʹ�ã�
//ͨ���������������������ϵĹ�ϵת��
public class Application1 {

	public static void main(String[] args) {
		//��һ�����������������ñ˴˵Ĺ�ϵ
		Person person=new Person("��ǿ",29);
		Car car=new Car("������",200000);
		person.setCar(car);   //һ������һ����
		car.setPerson(person);  //һ��������һ����
		//�ڶ��������ݹ�ϵ��ȡ����
		System.out.println(person.getCar().getInfo());  //������
		System.out.println();
		System.out.println(car.getPerson().getInfo());
	}

}
