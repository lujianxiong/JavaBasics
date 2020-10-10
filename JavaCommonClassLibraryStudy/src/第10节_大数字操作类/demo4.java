package 第10节_大数字操作类;

import java.math.BigDecimal;

public class demo4 {
    public static void main(String[] args) {
        BigDecimal bigA = new BigDecimal("1245234676425123");
        BigDecimal bigB = new BigDecimal("1256458");
        System.out.println("加法："+bigA.add(bigB));
        BigDecimal result[] = bigA.divideAndRemainder(bigB);
        System.out.println("除法：商："+result[0]+"余数："+result[1]);


    }
}
