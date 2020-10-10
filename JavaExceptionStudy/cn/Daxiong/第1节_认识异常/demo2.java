package Daxiong.第1节_认识异常;
//范例：观察产生异常
public class demo2 {
    public static void main(String[] args) {
        System.out.println("【1】******************程序开始执行******************");
        System.out.println("【2】数据计算：(10/0) = " + (10 / 0));  //10/0会产生异常，因为10/0是无穷大，无穷大会导致内存被占满
        System.out.println("【3】******************程序执行完毕******************");
    }
}
//在我们出现错误之后，整个程序将不会按照既定的方式进行执行，而是中断了执行
