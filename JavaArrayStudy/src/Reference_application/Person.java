package Reference_application;

public class Person {
	private String name;
	private int age;
	private Car car;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getInfo(){
		return "������"+this.name+"\n���䣺"+this.age;
	}
	//setter��getter��

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {//һ������һ����
		this.car = car;
	}
}
