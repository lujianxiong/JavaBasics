package 第20节_读取资源文件名称;
//资源文件在src目录下，不在包中
import java.util.ResourceBundle;

public class demo2 {
    public static void main(String[] args) {
        ResourceBundle source = ResourceBundle.getBundle("info");   //根据资源文件得到一个ResourceBundle类实例化对象
        System.out.println(source.getString("info"));    //根据key读取资源文件内容
        System.out.println(source.getString("sentence"));
    }
}
