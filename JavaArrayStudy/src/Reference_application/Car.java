package Reference_application;

public class Car {
	private double price;
	private String name;
	private Person person;
	public Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	
	public String getInfo(){
		return "������Ʒ���ͺţ�"+this.name+"\n�����ļ�ֵ��"+this.price;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {//һ������һ����
		this.person = person;
	}

}
