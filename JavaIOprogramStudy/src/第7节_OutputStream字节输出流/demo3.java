package 第7节_OutputStream字节输出流;
//范例：实现追加数据操作（\r\n 标准换行）
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class demo3 {
    public static void main(String[] args) throws Exception{

        //1、指定操作文件的路径
        File file = new File("e:"+File.separator+"hello"+File.separator+"Daxiong.txt");
        //对文件路径是否存在进行检验
        if (!file.getParentFile().exists()){   //如果父目录不存在
            file.getParentFile().mkdirs();   //创建父目录
        }

        //2、通过OutputStream的子类进行实例化
        //使用追加的形式
        try(OutputStream output = new FileOutputStream(file,true)){
            String str = "www.Daxiong.com\r\n";    //  \r\n  标准换行
            //3、将字符串转成字节数组
            output.write(str.getBytes());   //因为write方法接受的字节、字节对象
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
