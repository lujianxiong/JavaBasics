package 第21节_Scanner输入流工具;
//范例：输入一个人的生日（yyyy-MM-dd）
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入您的生日：");
        if (scan.hasNext("\\d{4}-\\d{2}-\\d{2}")){
            String birth = scan.next("\\d{4}-\\d{2}-\\d{2}");
            System.out.println("生日："+new SimpleDateFormat("yyyy-MM-dd").parse(birth));

        }
        scan.close();
    }
}
//hasnext和next方法中都可以进行正则验证，最好成对匹配，两个里面都验证