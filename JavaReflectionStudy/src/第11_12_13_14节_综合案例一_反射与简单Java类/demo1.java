package 第11_12_13_14节_综合案例一_反射与简单Java类;
//传统属性赋值弊端
public class demo1 {
    public static void main(String[] args) {
        Emp emp = new Emp();    //更多情况下开发者关注的是内容的设置
        emp.setEname("SMITH");
        emp.setJob("CLERK");
        //使用只能在对象设置属性之后
        System.out.println("姓名："+emp.getEname()+"、职位："+emp.getJob());
    }
}
