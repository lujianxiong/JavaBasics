package 第4节_UDP程序;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPServer {
    public static void main(String[] args) throws Exception{
        DatagramSocket server = new DatagramSocket(9000);    //连接到9000端口  【这是监听端口】
        String str = "Daxiong～";
        DatagramPacket packet;    //实例化DatagramPacket对象并设置数据，以及起始位置和长度
        packet = new DatagramPacket(str.getBytes(),0,str.length(), InetAddress.getByName("localhost"),9999);
        server.send(packet);    //发送消息
        System.out.println("消息发送完毕........");
        server.close();
    }
}
