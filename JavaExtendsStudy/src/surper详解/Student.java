package surper���;
//�����ڣ��Ӷ���ʵ��������
public class Student extends Person{
	@SuppressWarnings("unused")
	private String school;
	
	public Student(String name,int age,String school){  //���췽��
		super(name,age);   //��ȷ���ø��๹��    ������û���ṩ�޲ι��죬��������super()��ȷ�����вι��졣
		this.school=school;
	}
	

}
