package instanceof�ؼ���;
//��ʮ���� instanceof�ؼ��֣�
//��������ת��ǰʹ��instanceof�ؼ��ֽ����ж�
public class Javademo2 {
	public static void main(String[] args) {
		 Person per = new SuperMan();
		 if(per instanceof SuperMan){
			 SuperMan man = (SuperMan)per;
			 System.out.println(man.fly());
			 System.out.println(man.fire());
		 }

	}

}
