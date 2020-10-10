package 第3节_BIO处理模型;
//范例：修改服务器端
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    private static class ClientThread implements Runnable{
        private Socket client = null;  //描述每一个不同的客户端
        private Scanner scan = null;
        private PrintStream out = null;
        boolean flag = true;    //循环标记

        public ClientThread(Socket client) throws Exception{
            this.client = client;
            this.scan = new Scanner(client.getInputStream());    //客户端输入流，获取客户端发送来的信息
            this.scan.useDelimiter("\n");  //设置分隔符 【换行，即回车】
            this.out = new PrintStream(client.getOutputStream());   //客户端输出流
        }

        @Override
        public void run() {    //客户端循环接受数据
            while (this.flag){
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

            try {
                scan.close();
                out.close();
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(9999);    //设置服务器端的监听端口
        System.out.println("等待客户端连接........");
        boolean flag = true;    //循环标记

        //循环接收客户端
        while (flag){
            Socket client = server.accept();  //客户端连接
            new Thread(new ClientThread(client)).start();  //线程启动
        }
        server.close();

    }
}
