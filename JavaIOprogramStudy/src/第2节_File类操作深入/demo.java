package 第2节_File类操作深入;
//范例：正常开发时路径编写
import java.io.File;

public class demo {
    public static void main(String[] args) throws Exception {
        File file = new File("e:"+File.separator+"Daxiong.txt");  //在写路径的时候需要注意：“\”需要写成“\\”，进行转义
        if (file.exists()) {    //如果文件已经存在,就删除文件
            file.delete();
        }else {    //如果文件不存在，就创建
            System.out.println(file.createNewFile());      //创建新的文件
        }
    }
}
