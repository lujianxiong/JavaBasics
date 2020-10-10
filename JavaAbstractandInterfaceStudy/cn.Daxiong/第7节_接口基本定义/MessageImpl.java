package 第7节_接口基本定义;
//定义一个接口的子类
//一般自己写的代码中加个Impl表示是implements的缩写
public class MessageImpl implements IMessage,IChannel{  //implements多个接口以实现多继承
    @Override
    public String getInfo() {
        if(connect()){
            return "【Daxiong】发来一个秘密消息:今天我的博客访问量破万了！";
        }
        return "【通道创建失败，无法获取消息】";
    }

    @Override
    public boolean connect() {
        System.out.println("【消息发送通道已连接完毕】");
        return true;
    }
}
