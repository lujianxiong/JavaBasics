package ObjectArray;
//��10�� ��������
//��������Ķ�̬��ʼ��
public class Dynamic_initialization {

	public static void main(String[] args) {
		Person pr []=new Person [3];  //��������
		pr[0]=new Person("����",20);
		pr[1]=new Person("����",11);
		pr[2]=new Person("����",33);
		for(int i=0;i<pr.length;i++){
			System.out.println(pr[i].getInfo());
		}
	}

}
