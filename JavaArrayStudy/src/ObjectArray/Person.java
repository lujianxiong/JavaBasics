package ObjectArray;

public class Person {
	private String name;
	public int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getInfo(){
		return "������"+this.name+"���䣺"+this.age;
	}
	//setter��getter��
}
