package ����Ƚ�equals����;
//��ʮ�Ž� ����Ƚϣ�equals������
//�۲�Object���е�equals������д
public class Person2 {
	String name;
	int age;
	
	public Person2(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	@Override 
	public String toString(){
		return "������"+this.name+"�����䣺"+this.age;
	}
	
	//��дObject���е�equals����
	@SuppressWarnings("unused")
	@Override
	//equals()������ʱ������������󣬵�ǰ����this�������Object
	 public boolean equals(Object obj) {
		//1. ����Ķ�����Person2���ʵ��
		if(!(obj instanceof Person2)){
			return false;
		}
		//2. objΪnull�����
		if(obj == null){  //��if����жϿյ�����ܱ�֤���򲻳���
			return false;
		}
		//3. ͬһ�������������Ͳ���Ҫ�����ж���
		if(this == obj){  
			return  true;
		}
		//4. �������ʵ�ֱȽ�
		//ԭʼ��Object�����в�����name��age����
		//��˱�������ǿ��ת���ҵ�����������
		Person2 per = (Person2)obj;   //Ŀ����Ϊ�˻�ȡ���е�����
	    return this.name.equals(per.name) && this.age == per.age;
	}
	
}
