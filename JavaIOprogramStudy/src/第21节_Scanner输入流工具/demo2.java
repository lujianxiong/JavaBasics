package 第21节_Scanner输入流工具;
//范例：使用Scanner输入一个字符串
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入信息：");
        if (scan.hasNext()){
            System.out.println("信息："+scan.next());   //scan.next返回的就是字符串
        }
        scan.close();
    }
}
//需要注意的是，使用Scanner的情况下换行是不算输入的