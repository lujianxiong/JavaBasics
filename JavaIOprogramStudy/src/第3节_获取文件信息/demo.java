package 第3节_获取文件信息;
//通过一些操作获取文件的相关信息
import java.io.File;
import java.text.SimpleDateFormat;

public class demo {
    public static void main(String[] args) {
        File file = new File("c:"+File.separator+"图片.jpg");
        System.out.println("文件是否可读："+file.canRead());
        System.out.println("文件是否可写："+file.canWrite());
        System.out.println("文件大小："+MathUtil.round(file.length()/(double)1024/1024,2));
        System.out.println("最后的修改时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified()));
        System.out.println("是目录吗？"+file.isDirectory());
        System.out.println("是文件吗？"+file.isFile());

    }
}
