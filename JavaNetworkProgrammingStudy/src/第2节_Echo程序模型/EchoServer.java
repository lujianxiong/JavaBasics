package 第2节_Echo程序模型;
//范例：定义服务器端
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(9999);    //设置服务器端的监听端口
        System.out.println("等待客户端连接........");
        Socket client = server.accept();  //客户端连接
        //1、首先需要接受客户端发送来的信息，而后才可以将信息处理之后发送回客户端
        Scanner scan = new Scanner(client.getInputStream());    //客户端输入流，获取客户端发送来的信息
        scan.useDelimiter("\n");  //设置分隔符 【换行，即回车】
        PrintStream out = new PrintStream(client.getOutputStream());   //客户端输出流
        boolean flag = true;    //循环标记
        while (flag){
            if (scan.hasNext()){    //如果有数据
                String val = scan.next().trim();  //接受发送的数据  【因为数据会带有回车，所以要加trim】
                if ("byebye".equalsIgnoreCase(val)){
                    out.println("ByeByeBye......");   //直接输出提示语句
                    flag = false;    //结束循环
                }else{
                    out.println("【ECHO】"+val);  //输出接收的数据
                    //换成PrintStream的话，就不用强制刷新
                    //out.flush();  //强制刷新缓冲区（因为用的是PrintWriter）
                }
            }
        }
        scan.close();
        out.close();
        client.close();
        server.close();
    }
}
