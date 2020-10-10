package 第19节_静态代理设计模式问题分析;

//代理类
public class MessageProxy implements IMessage{
    private IMessage message;  //代理对象，一定是业务接口实例
    public MessageProxy(IMessage message){
        this.message = message;
    }

    public boolean connect(){
        System.out.println("【消息代理】：进行消息发送通道的连接");
        return true;
    }

    public void close(){
        System.out.println("【消息代理】：关闭消息通道");
    }

    @Override
    public void send() {
        if (this.connect()){
            this.message.send();  //消息的发送处理
            this.close();
        }
    }
}
