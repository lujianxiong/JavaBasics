package Daxiong.第6节_Lambda表达式.简化Lambda操作;
//简化lambda操作
public class Test {
    public static void main(String[] args) {
        IMath msg = (a,b)-> a+b;
        System.out.println(msg.add(100,200));
    }
}
