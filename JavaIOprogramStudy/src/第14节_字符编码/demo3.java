package 第14节_字符编码;
//范例：强制设置编码

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class demo3 {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("E:"+ File.separator+"hello"+File.separator+"Daxiong.txt");
        outputStream.write("中华人民共和国万岁".getBytes("ISO8859-1"));
        outputStream.close();
    }
}
