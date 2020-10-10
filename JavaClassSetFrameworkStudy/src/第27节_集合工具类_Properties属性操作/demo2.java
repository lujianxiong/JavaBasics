package 第27节_集合工具类_Properties属性操作;
//范例：将属性内容保存在文件之中
import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class demo2 {
    public static void main(String[] args) throws Exception{
        Properties prop = new Properties();
        //Properties类操作的类型只能是字符串
        prop.setProperty("Daxiong～","生日快乐！");
        prop.setProperty("BeiJing","北京");
        prop.store(new FileOutputStream(new File("E:"+File.separator+"hello"+File.separator+"属性输出.properties")),"中文的注释看不见的-English看得见");
    }
}
