package ѧ����̳�ʵ��;
//�ڶ�ʮ�� ѧ����̳�ʵ�����̳С���д����
public class Person {
	//�����ĸ�˽������
	private String name;
	private String addr;
	private char sex;
	private int age;
	
	public Person(){}   //���ι���
	public Person(String name,String addr){   //˫�ι���
		this(name,addr,'��',0);   //˫�ι�����ö�ι���
	}
	
	public Person(String name,String addr,char sex,int age){  //��ι���
		this.name = name;
		this.addr = addr;
		this.sex = sex;
		this.age = age;
	}
	
	public String getInfo(){   //�������
		return "������"+this.name+"����ַ��"+this.addr+"���Ա�"+this.sex+"�����䣺"+this.age;
	}
}
