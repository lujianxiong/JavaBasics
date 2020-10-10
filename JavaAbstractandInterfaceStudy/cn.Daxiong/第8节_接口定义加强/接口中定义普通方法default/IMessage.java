package 第8节_接口定义加强.接口中定义普通方法default;
//范例：接口中定义普通方法(default)
public interface IMessage {
    String message();
    public default boolean connect(){  //定义一个公共方法，所有子类都具备
        System.out.println("建立消息的发送通道");
        return true;
    }
}
