package ��������ת��;
//��ʮ��� ��������ת�ͣ�
//�۲�һ������ĳ���
public class Javademo2 {
	public static void main(String[] args) {
		System.out.println("----------����״̬�µĳ���Ӧ����һ����ͨ�˵�״̬-----------");
		Person per = new Person();     //������ת��
		per.print();
		System.out.println("------------���ι��޹�ɧ�ŵ���׼����������-------------");
		SuperMan man = (SuperMan)per;    //����ת�� ���ᱨ��
		System.out.println(man.fly());  //�ɲ�����
		System.out.println(man.fire());  //�粻����
	}

}
