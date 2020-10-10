package 第5节_File案例_文件批量更名;

import java.io.File;

public class demo {
    public static void main(String[] args) {
        File file = new File("e:"+File.separator+"各学院学生会通讯录信息");
        long start = System.currentTimeMillis();   //操作开始的时间
        renameDir(file);
        long end = System.currentTimeMillis();    //操作结束的时间
        System.out.println("本次操作花费的时间："+(end - start));
    }

    public static void renameDir(File file){
        if (file.isDirectory()) {  //如果是目录
            File results[] = file.listFiles();    //列出子目录中的文件
            if (results != null) {
                for (int x = 0; x < results.length; x++) {
                    renameDir(results[x]);   //递归调用
                }
            }
        }else{   //如果不是目录
            if (file.isFile()){  //如果是一个文件   进行重命名
                String fileName = null;
                if (file.getName().contains(".")) {   //如果文件名包含后缀
                    fileName = file.getName().substring(0, file.getName().lastIndexOf("."))+".txt";   //先把文件名和后缀分离出来，然后加上“.txt”
                }else {     //如果文件名不包含后缀
                    fileName = file.getName()+".txt";   //直接在后面加上“.txt”
                }
                File newFile = new File(file.getParent(),fileName);   //新的文件名称   （父路径+加后缀后的文件名）
                file.renameTo(newFile);    //重命名
            }
        }
    }
}
//对字符串操作的两个方法：
//public String substring(int beginIndex)       返回 指定索引处的字符一直到此字符串末尾 的字符串
//public int lastIndexOf(int ch)      返回指定字符在此字符串中最后一次出现处的索引