package 第26节ThreadLocal类.定义一个单线程结构;

public class Client {
    public static void main(String[] args) {
        Message msg = new Message();   //实例化消息对象
        msg.setInfo("Daxiong");    //设置要发送的内容
        Channel.setMessage(msg);     //设置要发送的消息
        Channel.send();   //发送消息
    }
}
