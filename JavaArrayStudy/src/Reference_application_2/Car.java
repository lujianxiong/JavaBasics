package Reference_application_2;

public class Car {
	String name;
	int price;
	Person person;
	
	public Car(String name,int price){
		this.name=name;
		this.price =price;
	}
	//setter��getter�� ��
	public String getInfo(){
		return "������Ʒ���ͺţ�"+this.name+" �����ļ۸��ǣ�"+this.price;
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

}
