package 第6节_反射获取类结构信息;
//范例：获得包名称
public class demo1 {
    public static void main(String[] args) {
        Class<?> cla = Person.class;   //获取指定类的Class对象
        Package pack = cla.getPackage();    //获取指定类
        System.out.println(pack.getName());
    }
}
