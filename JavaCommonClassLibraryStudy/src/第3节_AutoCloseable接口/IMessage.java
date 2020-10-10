package 第3节_AutoCloseable接口;

public interface IMessage extends AutoCloseable{
    void send();    //消息的发送
}
