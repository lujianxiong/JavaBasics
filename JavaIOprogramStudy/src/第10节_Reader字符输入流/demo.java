package 第10节_Reader字符输入流;
//范例：实现数据读取
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class demo {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"hello"+File.separator+"Daxiong.txt");
        if (file.exists()){   //文件存在,则进行文件读取
            Reader in = new FileReader(file);
            char data[] = new char[1024];
            int len = in.read(data);
            System.out.println("读取内容："+new String(data,0,len));    //字符数组转字符串
            in.close();

        }
    }
}
