package ������Ա��ְԱ�̳�ʵ��;
//�ڶ�ʮһ�� ������Ա��ְԱ�̳�ʵ����
//ְԱ��
public class Staff extends Employee{
	private String department;
	private double salary;
	
	public Staff(){}
	
	public Staff(String name,int age,char sex,String department,double salary){
		super(name,age,sex);
		this.department = department;
		this.salary = salary;
	}
	
	public String getInfo(){
		return "��ְԱ��:"+super.getInfo()+"������ = "+this.department+"����н = "+this.salary;
	}

}
