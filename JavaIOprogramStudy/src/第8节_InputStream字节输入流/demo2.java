package 第8节_InputStream字节输入流;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class demo2 {
    public static void main(String[] args) throws Exception {
        File file = new File("e:"+File.separator+"hello"+File.separator+"Daxiong.txt");
        InputStream  input = new FileInputStream(file);
        byte a [] = new byte[1024];   //开辟一个缓冲区读取数据
        int len = input.read(a);   //返回读取个数
        System.out.println("【"+new String(a,0,len)+"】");
        input.close();
    }
}
