package ��������ת��;
//��ʮ�Ľڣ���������ת��(���ܻ򷵻ز�����ͳһ��)
public class Javademo {
	public static void main(String[] args) {
		//DatabaseMessage msg = new DatabaseMessage();
		//������������newһ���������������ʵ��һ������ת��
		//����ת��ʵ�ֵ�����������
		//1.����ʵ�ָ���ļ̳й�ϵ����ʵ�ַ����ĸ�д   2.new����һ���������
		fun(new DatabaseMessage());  //������൱�� Message msg = new DatabaseMessage()
		fun(new WebServerMessage());        // Message msg = new WebServerMessage()
	}
	
	public static void fun(Message msg){
		//���ܴ��ݽ�������Message����һ�����࣬�����Խ���
		//�����������඼��д��print���������Զ�����ͨ��fun��������
		msg.print();
	}

//	//���û������ת�ͣ������������£�
//	//�������ؿ���ʵ����֮ǰ��ȫһ����Ч�������ǳ�������Ƶ�ʱ�򣬳������㵱ǰ��Ҫ��֮�⣬����Ҫ���ǵ���Ƶ�ά����
//	public static void fun(DatabaseMessage msg){
//		msg.print();
//	}
//	public static void fun(WebServerMessage msg){
//		msg.print();
//	}
//	

}
