package MappingTransformation;
//����ʵ���ӳ��
public class Dept {
	private long deptno;   //���ű��
	private String dname;    //�������� 
	private String loc;     //����λ��
	//����������֮������ù�ϵ
	private Emp emps [];     //һ�������ж����Ա
	
	public Dept(long deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	//setter��getter���޲ι��� ��
	
	public void setEmps(Emp [] emps){
		this.emps = emps;
	}
	public Emp [] getEmps(){
		return this.emps;
	}
	
	public String getInfo(){
		return "��������Ϣ�� ���ű�� = "+this.deptno+"���������� = "+this.dname+"������λ�� = "+this.loc;
	}

}
