package 第26节ThreadLocal类.多线程的影响;

//消息发送通道
public class Channel {
    private static Message message;
    private Channel(){};
    public static void setMessage(Message m){
        message = m;     //静态方法中用到的变量必须是静态变量
    }
    public static void send(){
        System.out.println("【"+Thread.currentThread().getName()+"、消息发送】"+message.getInfo());
    }
}
