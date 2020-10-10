package 第2节_File类操作深入;
//范例：创建多级目录
import java.io.File;

public class demo3 {
    public static void main(String[] args) throws Exception {
        File file = new File("e:"+File.separator+"hello"+File.separator+"demo"+File.separator+"Message"+File.separator+"Daxiong.txt");
        if (!file.getParentFile().exists()){    //如果父路径不存在
            file.getParentFile().mkdirs();    //创建父路径
        }
        if (file.exists()) {
            file.delete();
        }else {    //如果文件不存在，就创建
            System.out.println(file.createNewFile());      //创建新的文件
        }
    }
}
