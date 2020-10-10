package 第7节_OutputStream字节输出流;
//范例：自动关闭处理
//简化close操作，使用try-catch，采用AutoCloseable接口，取消手动关闭资源
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class demo2 {
    public static void main(String[] args) throws Exception{

        //1、指定操作文件的路径
        File file = new File("e:"+File.separator+"hello"+File.separator+"Daxiong.txt");
        //对文件路径是否存在进行检验
        if (!file.getParentFile().exists()){   //如果父目录不存在
            file.getParentFile().mkdirs();   //创建父目录
        }

        //2、通过OutputStream的子类进行实例化
        try(OutputStream output = new FileOutputStream(file)){
            String str = "www.Daxiong.com";    //要输出的文件内容
            //3、将字符串转成字节数组
            output.write(str.getBytes());   //因为write方法接受的字节、字节对象
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
