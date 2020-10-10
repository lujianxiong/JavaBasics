package 第3节_获取文件信息;

public class MathUtil {
    public static double round(double num,int scale){
        return Math.round(Math.pow(10,scale)*num) / Math.pow(10,scale);
    }
}
