package ������Ա��ְԱ�̳�ʵ��;
//�ڶ�ʮһ�� ������Ա��ְԱ�̳�ʵ����
//�������
public class Manager extends Employee{
	private String position;
	private double salary;
	
	public Manager(){}
	
	public Manager(String name,int age,char sex,String position,double salary){
		super(name,age,sex);
		this.position = position;
		this.salary = salary;
	}
	
	public String getInfo(){
		return "������㡿:"+super.getInfo()+"��ְλ = "+this.position+"����н = "+this.salary;
	}
}
