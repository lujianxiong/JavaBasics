package ����Ƚ�equals����;
//��ʮ�Ž� ����Ƚϣ�equals������
//��������Ƚ�
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
