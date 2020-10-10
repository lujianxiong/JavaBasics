package 第11_12_13_14节_综合案例一_反射与简单Java类;
//反射综合案例一：
public class demo2 {
    public static void main(String[] args) {
        String value = "empno:7369|ename:Smith|job:Clerk|salary:750.00|hiredate:1989-10-10|"+
                "dept.dname:财务部|dept.company.name:Xiong";
        Emp emp = ClassInstanceFactory.create(Emp.class,value);
        System.out.println("姓名："+emp.getEname()+"、职位："+emp.getJob()+"、基本工资："+emp.getSalary()+"、雇佣日期："+emp.getHiredate());
        System.out.println(emp.getDept().getDname());
        System.out.println(emp.getDept().getCompany().getName());
    }
}
