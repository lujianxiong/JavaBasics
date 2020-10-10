package 第19节_System类对IO的支持;
//范例：修改System.err的输出位置为指定文件
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class demo2 {
    public static void main(String[] args) throws Exception{
        System.setErr(new PrintStream(new FileOutputStream(new File("e:"+File.separator+"hello"+File.separator+"mldn.txt"))));
        try{
            Integer.parseInt("a");  //这个一定是出错的，字母不能变成Integer类型
        }catch (Exception e){
            System.out.println(e);
            System.err.println(e);   //输出到文件里了
        }
    }
}
