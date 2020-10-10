package 第10节_大数字操作类;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtil_demo5 {
    private MathUtil_demo5(){}

    /**
     * 自定义四舍五入操作
     * @param num  操作的数字  【这里的num可以定义为double类型，也可以定义为String类型，BigDecimal类兼容】
     * @param scale  保留的小数位数
     * @return   返回的数据
     */
    public static double round(String num,int scale){
        return new BigDecimal(num).divide(new BigDecimal(1.0),scale, RoundingMode.HALF_UP).doubleValue();
        // RoundingMode.HALF_UP表示向上进位
        //double和BigDecimal都是Number的子类，因此可以拆箱处理
        //上面的操作是将一个数除以他本身，按照保留位数和进位规则来执行
    }
}
