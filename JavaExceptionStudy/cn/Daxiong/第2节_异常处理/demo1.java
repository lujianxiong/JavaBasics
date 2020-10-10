package Daxiong.第2节_异常处理;
//范例：处理异常
public class demo1 {
    public static void main(String[] args) {
        System.out.println("【1】******************程序开始执行******************");
        try {
            System.out.println("【2】数据计算：(10/0) = " + (10 / 0));  //10/0会产生异常，因为10/0是无穷大，无穷大会导致内存被占满
        }catch (ArithmeticException e){
            System.out.println(e);    //处理异常，打印输出异常
        }
        System.out.println("【3】******************程序执行完毕******************");
    }
}
