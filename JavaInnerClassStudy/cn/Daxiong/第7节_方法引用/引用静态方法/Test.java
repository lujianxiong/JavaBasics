package Daxiong.第7节_方法引用.引用静态方法;

public class Test {
    public static void main(String[] args) {
        IFunction<Integer,String> fun = String ::valueOf;
        //在使用的时候指定泛型类型
        //静态方法的引用：类名 方法名 = 类名 :: 静态方法名 ，在这里，类名是IFunction<P,R>
        String str = fun.change(100);
        System.out.println(str.length());
    }
}
