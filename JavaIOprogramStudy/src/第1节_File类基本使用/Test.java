package 第1节_File类基本使用;
//范例：使用File类创建一个文件（e:\Daxiong.txt）
import java.io.File;

public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File("e:\\Daxiong.txt");  //在写路径的时候需要注意：“\”需要写成“\\”，进行转义
        if (file.exists()) {    //如果文件已经存在,就删除文件
            file.delete();
        }else {    //如果文件不存在，就创建
            System.out.println(file.createNewFile());      //创建新的文件
        }
    }
}
