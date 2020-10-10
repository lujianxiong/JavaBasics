package 第21节_Scanner输入流工具;
//范例：使用Scanner实现键盘数据输入
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入年龄：");
        if (scan.hasNextInt()){     //判断是否有整数输入
            int age = scan.nextInt();     //直接获取数字
            // 如果是BufferedReader的话，得先接收字符串，然后在转Int型
            System.out.println("您的年龄："+age);
        }else {
            System.out.println("咋看不懂人话呢？输入年龄！");
        }
        scan.close();
    }
}
