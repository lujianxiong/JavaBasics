package 第4节_UDP程序;
//范例：实现一个UDP客户端
//接受数据信息
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClient {
    public static void main(String[] args) throws Exception{
        DatagramSocket client = new DatagramSocket(9999);  //连接到9999端口  【这是客户端端口】
        byte data[] = new byte[1024];  //开辟空间接收消息
        DatagramPacket packet = new DatagramPacket(data,data.length);  //实例化DatagramPacket类对象并设置接收的数据以及数据长度
        System.out.println("客户端等待接收服务器端发送的消息：........");
        client.receive(packet);  //接受消息，此时所有消息都在data字节数组之中
        System.out.println("接受到的消息内容为："+ new String(data,0,packet.getLength()));
        client.close();

    }
}
