package 第20节_BufferedReader缓冲输入流;
//范例：BufferedReader类实现键盘数据输入
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class demo {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入信息：");
        String msg = input.readLine();     //接收输入信息
        System.out.println("输入内容为："+msg);
    }
}
