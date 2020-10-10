package 第20节_BufferedReader缓冲输入流;
//范例：接收整型输入并且验证。
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class demo2 {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入您的年龄：");
        String msg = input.readLine();     //接收输入信息
        if (msg.matches("\\d{1,3}")){    //使用正则验证是否由数字组成;且数字最少出现一位，最多出现三位
            int age = Integer.parseInt(msg);
            System.out.println("年龄为："+age);
        }else {
            System.out.println("请确保您看懂了我的提示，不要随意输入！");
        }
    }
}
