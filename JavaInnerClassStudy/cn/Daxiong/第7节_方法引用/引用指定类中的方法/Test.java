package Daxiong.第7节_方法引用.引用指定类中的方法;
//引用指定类中的方法
public class Test {
    public static void main(String[] args) {
        IFunction<String> fun = String ::compareTo;   //引用String类中的compareTo方法
        System.out.println(fun.compare("c","b"));    //compareTo是将两个字符串的ASCII码相减
    }
}
