package ������Ա��ְԱ�̳�ʵ��;
//�ڶ�ʮһ�� ������Ա��ְԱ�̳�ʵ����
//Ա����
public class Employee {
	private String name;
	private int age;
	private char sex;
	
	public Employee(){}

	public Employee(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public String getInfo(){
		return "������"+this.name+"�����䣺"+this.age+"���Ա�"+this.sex;
	}
	
}
