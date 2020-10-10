package 第3节_AutoCloseable接口;

public class Message implements IMessage{    //继承AutoCloseable接口，覆写close方法
    private String msg;
    public Message(String msg){
        this.msg = msg;
    }

    public boolean open(){    //获取资源连接
        System.out.println("【OPEN】获取消息发送连接资源");
        return true;
    }

    @Override
    public void close()throws Exception{   //抛个异常
        System.out.println("【CLOSE】关闭消息发送通道");
    }

    @Override
    public void send() {
        if (this.open()) {
            System.out.println("【*** 发送消息 ***】" + msg);
        }
    }
}
