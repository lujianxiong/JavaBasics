package 第11_12_13_14节_综合案例一_反射与简单Java类;

import java.util.Date;

public class Emp {
    private long empno;  //雇员编号
    private String ename;  //雇员姓名
    private String job;  //雇员职位
    private double salary;  //基本工资
    private Date hiredate;  //雇佣日期
    private Dept dept;   //雇员所在的部门

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Long getEmpno() {
        return empno;
    }

    public void setEmpno(long empno) {
        this.empno = empno;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

}
