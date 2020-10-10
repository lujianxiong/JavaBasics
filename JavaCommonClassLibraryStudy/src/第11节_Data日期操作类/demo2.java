package 第11节_Data日期操作类;
import java.util.Date;
//范例：观察Date与long类型之间的转换
public class demo2 {
    public static void main(String[] args) {
        Date date = new Date();
        long current = date.getTime();     //将date类型的日期转为long类型
        current += 864000*1000;  //10天的描述：10×24×3600 = 86400     86400×1000  单位是毫秒，得乘1000
        System.out.println(new Date(current));    //将long类型的current转为date类型
    }
}
