package Reference_application_2;

public class Application {
	public static void main(String[] args) {

		Person person = new Person("��˶",20);
		Car car = new Car("��ʱ��",200000);
		person.setCar(car);
		car.setPerson(person);
		
		//����˶�ĺ���ʵ����������
		Person childA = new Person("��ǿ",18);
		Person childB = new Person("����",19);
		childA.setCar(new Car("BMW X1",100000));   //��������
		childB.setCar(new Car("������",200000));
		person.setChildren(new Person[]{childA,childB});   //һ�����ж������
		
		
		//���ݹ�ϵ��ȡ����
		System.out.println(person.getCar().getInfo());
		System.out.println(car.getPerson().getInfo());
		
		//�������ҵ����еĺ����Լ���Ӧ������
		for(int x=0;x<person.getChildren().length;x++){
			System.out.println("\t|-"+person.getChildren()[x].getInfo());
			System.out.println("\t\t|-"+person.getChildren()[x].getCar().getInfo());
		}
	}

}
