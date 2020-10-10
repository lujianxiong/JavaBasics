package Daxiong.第2节_内部类相关说明.接口内部进行接口实现;

public class demo {
    public static void main(String[] args) {
        //IChannel channel = new IChannel.ChannelImp();
        //这上面这行代码与下面这行代码的作用完全一样
        IChannel channel =IChannel.getInstance();
        channel.send();
    }
}
