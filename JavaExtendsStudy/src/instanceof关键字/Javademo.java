package instanceof�ؼ���;
//��ʮ���� instanceof�ؼ��֣�
//�۲�instanceof
//instanceof �ؼ��ֿ����ж�ĳ��ʵ���Ƿ���ĳ����Ķ���
public class Javademo {
	public static void main(String[] args) {
		Person per = new Person();     //��ת��
		System.out.println(per instanceof Person);  //true
        System.out.println(per instanceof SuperMan);  //false
        System.out.println("-----------------------------");  

        Person per2 = new SuperMan();     //ת��
		System.out.println(per2 instanceof Person);  //true
        System.out.println(per2 instanceof SuperMan);  //true
	}

}
