package MappingTransformation;

public class Test {

	public static void main(String[] args) {
		//��һ�������ݹ�ϵ������Ķ����ʼ��
		//���������ʵ�������󣬴�ʱ��û���κι�������
		Dept dept = new Dept(10,"����","�Ϻ�");
		Emp empA = new Emp(7369L,"SMITH","CLERK",800.00,0.0);   //clerk�ǹ�Ա
		Emp empB = new Emp(7369L,"DORD","MANAGER",2450.00,0.0);    //manager�ǹ�����
		Emp empC = new Emp(7369L,"KING","PRESIDENT",5000.00,0.0);    //president���ܾ����ܲ�
		
		//Ϊ������й���������
		empA.setDept(dept);    //���ù�Ա�벿�ŵĹ�����A��Ա��dept���ŵģ�
		empB.setDept(dept);    //���ù�Ա�벿�ŵĹ�����B��Ա��dept���ŵģ�
		empC.setDept(dept);    //���ù�Ա�벿�ŵĹ�����C��Ա��dept���ŵģ�
		empA.setEmp(empB);     //���ù�Ա�벿�ŵĹ�����A����˾��B��
		empB.setEmp(empC);     //���ù�Ա�벿�ŵĹ�����B����˾��C��
		dept.setEmps(new Emp []{empA,empB,empC});   //�������ж����Ա��A��B��C
		
		//�ڶ��������ݹ�ϵ��ȡ����
		System.out.println(dept.getInfo());    //��ӡ������Ϣ
		for(int i=0;i<dept.getEmps().length;i++){
			System.out.println("\t|- "+dept.getEmps()[i].getInfo());   //��ӡ��Ա����ϸ��Ϣ
			
			if(dept.getEmps()[i].getEmp()!=null){  //ֻ�����������쵼
			System.out.println("\t\t|- "+dept.getEmps()[i].getEmp().getInfo());   //��ӡ��Ա���쵼
			}
		}
		
		System.out.println("-------------------------------------------");
		System.out.println(empA.getDept().getInfo());    //���ݲ�Ա��ȡ������Ϣ
		System.out.println(empA.getEmp().getInfo());     //���ݲ�Ա��ȡ�쵼��Ϣ
	}
}
