package MappingTransformation;
//��Աʵ���ӳ��
public class Emp {
	 private long mgrno;    //��Ա���
	 private String ename;    //��Ա����
	 private String job;     //��Աְλ
	 private double sal;     //�������� 
	 private double comn;    //Ӷ��
	 //����������֮������ù�ϵ
	 private Dept dept;    //һ����Ա����һ������
	 private Emp mgr;      //һ����Ա��һ���쵼
	public Emp(long mgrno, String ename, String job, double sal, double comn) {
		this.mgrno = mgrno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comn = comn;
	}
	//setter��getter���޲ι��� ��
	
	public String getInfo(){
		return "����Ա��Ϣ�� ��Ա��� = "+this.mgrno+"����Ա���� = "+this.ename+"����Աְλ = "+this.job+"���������� = "+this.sal+"��Ӷ�� = "+this.comn;
	}
	
	public void setDept(Dept dept){
		this.dept=dept;
	}
	public void setEmp(Emp mgr){
		this.mgr=mgr;
	}
	public Dept getDept(){
		return dept;
	}
	public Emp getEmp(){
		return mgr;
	}
	
	 

}
