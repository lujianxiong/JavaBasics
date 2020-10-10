package 第8节_接口定义加强.接口中定义static方法;
//范例：接口中定义static方法
public interface IMessage {
    String message();
    public default boolean connect(){  //定义一个公共方法，所有子类都具备
        System.out.println("建立消息的发送通道");
        return true;
    }

    public static IMessage getInstence(){   //static方法可以在没有实例化对象的情况下通过接口名或类名直接调用
        return new MessageImpl();    //获得子类对象
    }
}
