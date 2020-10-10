package 第18节_打印流;
//范例：使用PrintWriter实现数据的输出
//对比咱们自定义的，只要把自定义的类换成PrintWriter就ok了
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class demo2 {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"hello"+File.separator+"ainiyou.txt");   //定义操作文件
        PrintWriter printUtil = new PrintWriter(new FileOutputStream(file));   //在这里传入OutputStream的子类实例化对象，给用户可以选择的权利
        printUtil.println("姓名：小强");
        printUtil.print("年龄：");
        printUtil.println(80);
        printUtil.close();
    }
}
