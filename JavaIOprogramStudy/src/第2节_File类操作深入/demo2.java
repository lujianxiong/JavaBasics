package 第2节_File类操作深入;
//范例：在Windows系统使用Linux系统的分隔符
import java.io.File;

public class demo2 {
    public static void main(String[] args) throws Exception {
        File file = new File("e:/Daxiong.txt");
        if (file.exists()) {    //如果文件已经存在,就删除文件
            file.delete();
        }else {    //如果文件不存在，就创建
            System.out.println(file.createNewFile());      //创建新的文件
        }
    }
}
