package ����Ƚ�equals����;
//��ʮ�Ž� ����Ƚϣ�equals������
//��������Ƚ�
public class Javademo {
	public static void main(String[] args) {
		Person perA = new Person("����",20);
		Person perB = new Person("����",20);
		if(perA.getName().equals(perB.getName()) &&
		   perA.getAge() == perB.getAge()){
			System.out.println("��ͬһ������");
		}else{
			System.out.println("����ͬһ������");
		}
	}

}
