package 第12节_转换流;

import java.io.*;

public class demo {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+ File.separator+"hello"+File.separator+"Daxiong.txt");
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }

        OutputStream output = new FileOutputStream(file);
        Writer out = new OutputStreamWriter(output);    //字节流转为字符流
        out.write("Dxiong!!");    //直接输出字符串;且字符流适合处理中文
        out.close();
    }
}
