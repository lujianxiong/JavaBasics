package 第19节_静态代理设计模式问题分析;

//传统的代理模式必须有接口
public interface IMessage {
    public void send();  //业务真实发送
}
