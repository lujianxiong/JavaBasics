package 第3节_获取文件信息;
//输出指定目录下的全部文件
import java.io.File;

public class demo2 {
    public static void main(String[] args) {
        File file = new File("e:"+File.separator);
        if (file.isDirectory()){    //当前是一个目录
            File result[] = file.listFiles();    //列出目录中的全部内容
            for (int i = 0; i <result.length; i++) {
                System.out.println(result[i]);
            }
        }
    }
}
