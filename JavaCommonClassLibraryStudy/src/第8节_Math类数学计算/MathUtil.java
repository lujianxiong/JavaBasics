package 第8节_Math类数学计算;
//范例：自定义保留位数四舍五入
public class MathUtil {
    private MathUtil(){}   //构造方法私有化，禁止实例化对象  （如果不写，默认有无参构造）

    //下面是定义的一个方法的说明
    /**
     * 实现数据的四舍五入的操作
     * @param num ：要进行四舍五入操作的数字
     * @param scale :四舍五入保留的位数
     * @return ：四舍五入处理后的结果
     */
    public static double round(double num,int scale){
        return Math.round(num * Math.pow(10,scale)) / Math.pow(10,scale);
        /**
         * 比如对1999.321 保留两位小数取整：
         * 先给它×100，然后round，在/100，就ok了
         * 199932.1      199932      1999.32
         */
    }
}

//Math.pow(x,y)  计算x的y次方