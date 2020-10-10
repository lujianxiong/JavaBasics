package Daxiong.第2节_异常处理;
//范例：使用finally语句
public class demo3 {
    public static void main(String[] args) {
        System.out.println("【1】******************程序开始执行******************");
        try {
            System.out.println("【2】数据计算：(10/0) = " + (10 / 0));
        }catch (ArithmeticException e){
            e.printStackTrace();      //获取完整的异常信息
        }finally {
            System.out.println("【F】不管是否出现异常，我都会执行");
        }
        System.out.println("【3】******************程序执行完毕******************");
    }
}
