package 第14节_字符编码;
//范例：编写程序
import java.io.*;

public class demo2 {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("E:"+ File.separator+"hello"+File.separator+"Daxiong.txt");
        outputStream.write("中华人民共和国万岁".getBytes());
        outputStream.close();
    }
}
