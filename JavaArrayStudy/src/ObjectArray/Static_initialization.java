package ObjectArray;
//��10�� ��������
//��������ľ�̬��ʼ��
public class Static_initialization {

	public static void main(String[] args) {
		Person pr []=new Person []{
			new Person("����",20),
			new Person("����",11),
			new Person("����",33)
		};  //��̬��ʼ����������
	
		for(int i=0;i<pr.length;i++){
			System.out.println(pr[i].getInfo());
		}
	}
}
