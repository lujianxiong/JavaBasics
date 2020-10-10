package 第13节_IO综合案例_文件拷贝;
//范例：实现文件拷贝处理  【原始处理】
import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        long start = System.currentTimeMillis();
        FileUtil fu = new FileUtil(s1,s2);
        System.out.println(fu.copy()?"文件拷贝成功！":"文件拷贝失败！");
        long end = System.currentTimeMillis();
        System.out.println("拷贝文件用时："+(end - start));
    }
}
//测试输入：
//  E:\hello\Daxiong.txt
//  E:\hello\xixi.txt