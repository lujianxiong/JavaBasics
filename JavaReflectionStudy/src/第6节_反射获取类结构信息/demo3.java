package 第6节_反射获取类结构信息;
//范例：获取父接口
public class demo3 {
    public static void main(String[] args) {
        Class<?> cla = Person.class;   //获取指定类的Class对象
        Class<?> clazz[] = cla.getInterfaces();
        for (Class<?> temp : clazz){
            System.out.println(temp.getName());
        }
    }
}
