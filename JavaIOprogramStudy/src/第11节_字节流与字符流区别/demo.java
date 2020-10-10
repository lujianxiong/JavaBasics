package 第11节_字节流与字符流区别;
//范例：使用Writer并强制性刷新  【Write之类的必须要进行强制刷新】
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class demo {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+ File.separator+"hello"+File.separator+"Daxiong.txt");
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }

        Writer out = new FileWriter(file);
        String str = "比心心";
        out.write(str);
        out.flush();  //强制性刷新
        //out.close();

    }
}
