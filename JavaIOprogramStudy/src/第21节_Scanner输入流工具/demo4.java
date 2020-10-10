package 第21节_Scanner输入流工具;
//范例：使用Scanner读取  【没实现出来，不知道什么问题】
import java.io.File;
import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(new File("e:"+File.separator+"hello"+File.separator+"123.txt"));
        scan.useDelimiter("\n");    //读取分隔符
        while (scan.hasNext()){
            System.out.println(scan.next());
        }
        scan.close();
    }
}

