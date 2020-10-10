package Daxiong.第2节_内部类相关说明.接口中定义内部接口;

public interface IChannel {   //定义接口
    public void send(IMessage msg);    //发送消息

    interface IMessage{    //定义一个内部接口
        public String getContent();  //获取消息内容
    }
}
