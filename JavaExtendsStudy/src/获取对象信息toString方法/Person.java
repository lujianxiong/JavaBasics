package ��ȡ������ϢtoString����;
//��ʮ�˽� ��ȡ������Ϣ��toString��������
//�۲�toString����
//��дtoString����
public class Person {
	String name;
	int age;
	
	//���췽������ʵ����
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	//��дtoString����
	@Override   //��д����ע��
	public String toString(){
		return "������"+this.name+"�����䣺"+this.age;
	}

}
