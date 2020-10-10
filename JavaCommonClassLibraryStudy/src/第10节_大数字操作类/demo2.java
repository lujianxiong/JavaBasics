package 第10节_大数字操作类;
//范例：观察性能问题
import java.math.BigInteger;

public class demo2 {
    public static void main(String[] args) {
        BigInteger bigA = new BigInteger("24183174082175024");
        BigInteger bigB = new BigInteger("2421432415213");
        System.out.println(bigB.pow(Integer.MAX_VALUE));   //计算次方
        //Integer.MAX_VALUE = 2^31 - 1 = 2147483648 - 1 = 2147483647

        int data[] = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 0; i < data.length; i++) {

        }
    }
}
//运行出来会报错java.lang.ArithmeticException 算数异常、溢出等...所以任何的电脑都是有极限的