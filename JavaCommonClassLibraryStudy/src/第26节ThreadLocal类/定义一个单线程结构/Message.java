package 第26节ThreadLocal类.定义一个单线程结构;

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
