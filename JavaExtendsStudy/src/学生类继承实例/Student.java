package ѧ����̳�ʵ��;
//�ڶ�ʮ�� ѧ����̳�ʵ�����̳С���д����
public class Student extends Person{
	private double math;
	private double english;
	
	public Student(){}
	
	public Student(String name,String addr){
		super(name,addr);    //���ø����˫�ι���
	}
	
	public Student(String name,String addr,char sex,int age,double math,double english){
		super(name,addr,sex,age);  //���ø��๹�췽��
		this.math = math;
		this.english = english;
	}
	
	public String getInfo(){
		return super.getInfo()+"����ѧ�ɼ�:"+this.math+"��Ӣ��ɼ�:"+this.english;
	}
}
