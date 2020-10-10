package 第26节ThreadLocal类.多线程的影响;

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
