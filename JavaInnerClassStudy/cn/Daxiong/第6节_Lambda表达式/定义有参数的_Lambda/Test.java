package Daxiong.第6节_Lambda表达式.定义有参数的_Lambda;

public class Test {
    public static void main(String[] args) {
        IMath msg = (a,b)->{
            return a+b;
        };
        System.out.println(msg.add(100,200));
    }
}
