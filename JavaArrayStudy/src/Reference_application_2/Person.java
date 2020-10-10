package Reference_application_2;

public class Person {
	private String name;
	private int age;
	private Car car;   //һ�����ж�����
	private Person children[];    //һ�����ж������
	
	public Person(String name,int age){
		this.age=age;
		this.name=name;
	}
	
	
	public Person[] getChildren() {
		return children;
	}

	public void setChildren(Person[] children) {
		this.children = children;
	}



	public String getInfo(){
	    return "�˵������ǣ�"+this.name+" ������Ϊ��"+this.age;
	}
	//setter��getterʡ��

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
		
}
