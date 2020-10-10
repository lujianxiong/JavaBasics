package 第26节ThreadLocal类.ThreadLocal类解决多线程数据覆盖问题;
//ThreadLocal类解决线程同步问题
public class Channel {
    private static ThreadLocal<Message> THREADLOCAL = new ThreadLocal<>(); //实例化ThreadLocal类对象，设置泛型，定义为final只允许初次实例化；
    private Channel(){};
    public static void setMessage(Message m){
        THREADLOCAL.set(m);    //向ThreadLocal中保存数据；这种保存数据会把当前的线程对象也存进来
    }
    public static void send(){
        System.out.println("【"+Thread.currentThread().getName()+"、消息发送】"+THREADLOCAL.get().getInfo());    //根据当前线程对象进行取出！！
    }
}
