package 第6节_反射获取类结构信息;
//范例：获取父类信息
public class demo2 {
    public static void main(String[] args) {
        Class<?> cla = Person.class;   //获取指定类的Class对象
        Class<?> parent = cla.getSuperclass();  //获取父类的类信息
        System.out.println(parent.getName());  //Person类的父类
        System.out.println(parent.getSuperclass().getName());   //Person类父类的父类
        //再往后就是Object的父类，不存在
    }
}
