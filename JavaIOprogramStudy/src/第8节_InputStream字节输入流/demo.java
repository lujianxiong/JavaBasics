package 第8节_InputStream字节输入流;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class demo {
    public static void main(String[] args) throws Exception {
        File file = new File("e:"+File.separator+"hello"+File.separator+"Daxiong.txt");
        InputStream  input = new FileInputStream(file);
        byte a [] = new byte[1024];   //开辟一个缓冲区读取数据
        input.read(a);   //读取数据，数据全部保存在字节数组之中
        System.out.println("【"+new String(a)+"】");
        input.close();
    }
}
