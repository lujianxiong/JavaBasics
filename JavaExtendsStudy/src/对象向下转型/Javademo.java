package ��������ת��;
//��ʮ��� ��������ת�ͣ�
public class Javademo {
	public static void main(String[] args) {
		System.out.println("----------����״̬�µĳ���Ӧ����һ����ͨ�˵�״̬-----------");
		Person per = new SuperMan();     //����ת��
		per.print();
		System.out.println("------------���ι��޹�ɧ�ŵ���׼����������-------------");
		SuperMan man = (SuperMan)per;    //����ת�� (�����˴򲻹�����Ҫ������)
		System.out.println(man.fly());  //�ȷ�����
		System.out.println(man.fire());  //���

	}

}
