package 第15节_内存操作流;
//范例：利用内存流实现一个小写字母转大写字母的操作
//以字符串形式获取数据
import java.io.*;

public class demo {
    public static void main(String[] args) throws Exception {
        String str = "daxiong";   //小写字母
        InputStream inputStream = new ByteArrayInputStream(str.getBytes());   //将字节数组存放的数据保存到内存流
        OutputStream outputStream = new ByteArrayOutputStream();     //读取内存中的数据
        int data = 0;
        while ((data = inputStream.read()) != -1){    //每次读取一个字节
            outputStream.write( Character.toUpperCase(data));  //使用字符串大小写转换操作，并向输出流保存数据
        }
        System.out.println(outputStream);   //默认调用本类中的toString方法，而ByteArrayOutputStream类中的toString方法可以 以字符串的形式获取数据
        inputStream.close();
        outputStream.close();
    }
}
