package ����Ƚ�equals����;
//��ʮ�Ž� ����Ƚϣ�equals������
//�۲�Object���е�equals������д
public class Javademo2 {
	public static void main(String[] args){
		Person2 perA = new Person2("zhangsan",20);
		Person2 perB = new Person2("zhangsan",20);
		System.out.println(perA.equals(perB));  //true
		System.out.println(perA.equals("��"));  //true
		//���жϷŵ����ڲ������жϣ�������Java�ķ�װ�ԡ�
		
	}

}
