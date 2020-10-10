package 第19节_System类对IO的支持;
//范例：InputStream类实现键盘输入
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class demo3 {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = System.in;    //此时输入流为键盘输入
        System.out.print("请输入信息：");
        byte[] datas = new byte[1024];
        int len = inputStream.read(datas);
        System.out.println("输入内容为："+new String(datas,0,len));

    }
}
