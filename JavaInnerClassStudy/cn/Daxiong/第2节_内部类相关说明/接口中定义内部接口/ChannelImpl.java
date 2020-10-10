package Daxiong.第2节_内部类相关说明.接口中定义内部接口;

public class ChannelImpl implements IChannel{
    @Override
    public void send(IMessage msg) {
        System.out.println("发送消息："+msg.getContent());
    }

    class MessageImpl implements IMessage{
        @Override
        public String getContent() {
            return "Daxiong";
        }
    }
}
