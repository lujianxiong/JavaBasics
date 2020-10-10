package 第26节ThreadLocal类.ThreadLocal类解决多线程数据覆盖问题;
//ThreadLocal类解决线程同步问题
//要发送的消息体
public class Message {
    private String info;
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return this.info;
    }
}
