package Daxiong.第2节_内部类相关说明.接口内部进行接口实现;
//在接口内部实现接口，并且通过static方法实现子类实例化
//这种结构的话在Java内部经常见到，以后用不用看自己。
public interface IChannel {   //定义接口
    public void send();

    class ChannelImp implements IChannel{
        @Override
        public void send() {
            System.out.println("Daxiong");
        }
    }

    public static IChannel getInstance(){  //定义一个static方法 实例化ChannelImp类对象
        return new ChannelImp();
    }

}
