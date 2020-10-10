package 第13节_IO综合案例_文件拷贝;
//范例：实现对文件夹的完整拷贝
import java.io.File;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        long start = System.currentTimeMillis();
        FileUtil_2 fu = new FileUtil_2(s1,s2);
        if (new File(s1).isFile()){   //文件拷贝
            System.out.println(fu.copy()?"文件拷贝成功！":"文件拷贝失败！");
        } else {    //否则，拷贝目录
            System.out.println(fu.copyDir()?"文件拷贝成功！":"文件拷贝失败！");
        }

        long end = System.currentTimeMillis();
        System.out.println("拷贝文件用时："+(end - start));
        //注意：文件用时输出的是毫秒
    }
}

//测试输入：
//  E:\hello\各学院学生会通讯录信息
//  E:\hello\test\新建文件夹