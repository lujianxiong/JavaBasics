package ���Ը���;
//���߽� ���Ը��ǣ�
public class DatabaseChannel extends Channel{  //Ҫ�������ݿ������
	String info = "HelloWorld";   //������ͬ������info
	public void fun(){  
		//System.out.println(super.info);   //����super�ܵ��ø������������Ϊ��������û�б���װ
		System.out.println(this.info);   
		
		//���踸�����Ա���װ
		System.out.println(super.getinfo());   

	}
}
