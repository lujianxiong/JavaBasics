package 第7节_OutputStream字节输出流;
//范例：使用OutputStream类实现内容的输出
//最基本的OutputStream的操作【最原始、最繁琐的】
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class demo {
    public static void main(String[] args) throws Exception{

        //1、指定操作文件的路径
        File file = new File("e:"+File.separator+"hello"+File.separator+"Daxiong.txt");
        //对文件路径是否存在进行检验
        if (!file.getParentFile().exists()){   //如果父目录不存在
            file.getParentFile().mkdirs();   //创建父目录
        }

        //2、通过OutputStream的子类进行实例化
        OutputStream output = new FileOutputStream(file);
        String str = "www.Daxiong.com";    //要输出的文件内容

        //3、将字符串转成字节数组
        output.write(str.getBytes());   //因为write方法接受的字节、字节对象

        //4、关闭资源
        output.close();

    }
}
