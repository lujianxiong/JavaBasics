package 第29节_IO编程案例四扩展_类对象排序处理;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FileUtil {
    //读取数据具体操作
    public static String load(File file){
        Scanner scan = null;  //只要是读取数据就用Scanner
        try {
            scan = new Scanner(file);    //文件加载
            if (scan.hasNext()) {
                String str = scan.next();  //如果有数据，就获取数据
                return str;
            }
            return null;  //无数据就返回空
        }catch (Exception e){
            return null;
        }finally {
            if (scan != null){
                scan.close();
            }
        }
    }

    //追加数据具体操作
    public static boolean append(File file,String content){
        PrintStream out = null;
        try {
            out = new PrintStream(new FileOutputStream(file,true));  //只要是内容的输出就使用打印流
            out.print(content);    //内容追加
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }finally {
            if (out != null){
                out.close();
            }
        }
    }
}
