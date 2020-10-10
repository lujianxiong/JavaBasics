package 第15节_内存操作流;
//范例：利用ByteArrayOutputStream类的扩展功能获取全部字节数据
//这种操作相对来说复杂一些
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class demo2 {
    public static void main(String[] args) throws Exception{
        String str = "daxiong";   //小写字母
        InputStream inputStream = new ByteArrayInputStream(str.getBytes());   //将字节数组存放的数据保存到内存流

        //必须使用子类来调用子类自己的扩展方法
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();     //读取内存中的数据
        int data = 0;
        while ((data = inputStream.read()) != -1){    //每次读取一个字节
            outputStream.write( Character.toUpperCase(data));  //使用字符串大小写转换操作，并向输出流保存数据
        }

        byte result[] = outputStream.toByteArray();   //获取全部数据
        System.out.println(new String(result));    //自己处理字节数据
        inputStream.close();
        outputStream.close();
    }
}
