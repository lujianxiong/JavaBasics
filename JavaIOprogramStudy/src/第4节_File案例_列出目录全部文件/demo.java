package 第4节_File案例_列出目录全部文件;
//范例：设置一个目录的路径，将这个目录中所有文件的信息全部列出，包括子目录中的所有文件。（利用递归的形式完成）
import java.io.File;
public class demo {
    public static void main(String[] args) {
        File file = new File("e:"+File.separator);  //指定一个目录
        listDir(file);
    }

    public static void listDir( File file){
        if (file.isDirectory()) {    //是一个目录
            File result[] = file.listFiles();     //列出目录中的全部内容
            if (result != null) {
                for (int x = 0; x < result.length; x++) {
                    listDir(result[x]);   //进行递归判断
                }
            } else {    //不是一个目录；   获得完整路径
                System.out.println(file);
            }
        }
    }
}
