package Daxiong.第2节_内部类相关说明.接口中定义内部接口;

public class demo {
    public static void main(String[] args) {
        IChannel channel = new ChannelImpl();   //实例化一个接口的子类对象
        channel.send(((ChannelImpl)channel).new MessageImpl());
        //send里面是IMessage对象，new MessageImpl()自动向上转型为IMessage对象
        //MessageImpl是ChannelImpl的内部类，内部类实际上是内部类.外部类
        //channel是IChannel接口的对象，需要强制向下转型为ChannelImpl类
        //因为channel 在上面一行new过了，因此只需要强转就可以了。
        //这一行的结构真tm复杂....
    }
}
