package ������д;
//����� ������д
public class DatabaseChannel extends Channel{  //Ҫ�������ݿ������
	public void connect(){  //�������еķ������ƣ�������и�д
		super.connect();  //ֱ�ӵ��ø����еķ���
		//���ֱ������д��connect();  �ͻᱨ��������ѭ����connect()Ĭ���ǣ�this.connect();
		//�����ȴӱ�������connect������һ���ҵ��ˣ�Ȼ���ѭ�������Լ���
		System.out.println("�����ࡿ�������ݿ���Դ������");
		
	}

}
//ֻҪ���������е��ø��෽����ʱ��һ��Ҫ�ڷ���ǰ��׷���С�super.������