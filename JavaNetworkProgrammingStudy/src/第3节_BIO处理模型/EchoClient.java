package 第3节_BIO处理模型;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    private static final BufferedReader KEYBOARD_INPUT = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost",9999);    //定义服务端的连接信息  （第一个参数可以写本机的IP地址，也可以直接写“localhost”表示本机）
        //现在的客户端需要有输入和输出的操作支持，所以依然要准备Scanner和PrintWriter
        Scanner scan = new Scanner(client.getInputStream());  //接受服务器端的输入内容 【实例化输入流】
        scan.useDelimiter("\n");   //设置分隔符
        PrintStream out = new PrintStream(client.getOutputStream());  //向服务器端发送内容  【实例化输出流】
        boolean flag = true;
        while (flag){
            String input = getString("请输入要发送的内容：").trim();
            out.println(input);  //输出数据（加换行）
            //out.flush();
            if (scan.hasNext()){  //如果服务器端有回应了
                System.out.println(scan.next());  //输出数据
            }
            if ("byebye".equalsIgnoreCase(input)){
                flag = false;
            }
        }
        scan.close();
        out.close();
        client.close();
    }

    public static String getString(String prompt) throws Exception{  //接受的是提示信息
        System.out.println(prompt);  //输出提示信息
        String str = KEYBOARD_INPUT.readLine();  //使用BufferedReader输入流每行读入
        return str;
    }
}
