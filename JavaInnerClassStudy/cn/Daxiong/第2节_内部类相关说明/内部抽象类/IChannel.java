package Daxiong.第2节_内部类相关说明.内部抽象类;
//观察内部抽象类
public interface IChannel {
    public void send();   //发送消息

    //在接口中定义一个内部抽象类
    abstract class AbstractMessage{
        public abstract String getContent(); //抽象方法
    }
}
