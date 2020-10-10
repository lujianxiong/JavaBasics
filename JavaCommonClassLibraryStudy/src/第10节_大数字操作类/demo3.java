package 第10节_大数字操作类;
//范例：BigInteger 求余除法
import java.math.BigInteger;

public class demo3 {
    public static void main(String[] args) {
        BigInteger bigA = new BigInteger("24183174082175022353264585764");
        BigInteger bigB = new BigInteger("2421432415213");
        BigInteger result[] = bigA.divideAndRemainder(bigB);
        System.out.println("商："+result[0]+"余数："+result[1]);


    }
}
