package 第10节_大数字操作类;
//范例：使用BigInteger实现四则运算
import java.math.BigInteger;

public class demo1 {
    public static void main(String[] args) {
        BigInteger BigA = new BigInteger("211312412422953376094352356157945432125213114123");
        BigInteger bigB = new BigInteger("76945621412313");
        System.out.println("加法操作:" + BigA.add(bigB));
        System.out.println("减法操作:" + BigA.subtract(bigB));   //subtract：减法
        System.out.println("乘法操作:" + BigA.multiply(bigB));   //multiply：乘法
        System.out.println("除法操作:" + BigA.divide(bigB));    //divide：除法

    }
}
