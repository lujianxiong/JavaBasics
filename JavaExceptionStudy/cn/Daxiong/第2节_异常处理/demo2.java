package Daxiong.第2节_异常处理;
//范例：获取完整异常信息：
public class demo2 {
    public static void main(String[] args) {
        System.out.println("【1】******************程序开始执行******************");
        try {
            System.out.println("【2】数据计算：(10/0) = " + (10 / 0));
        }catch (ArithmeticException e){
            e.printStackTrace();      //获取完整的异常信息
        }
        System.out.println("【3】******************程序执行完毕******************");
    }
}
