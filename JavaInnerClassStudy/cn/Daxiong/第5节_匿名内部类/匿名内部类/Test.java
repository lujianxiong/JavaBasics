package Daxiong.第5节_匿名内部类.匿名内部类;
//观察匿名内部类
//本来IMessage是接口，接口不能实例化对象，
public class Test {
    public static void main(String[] args) {
        IMessage msg = new IMessage() {  //匿名内部类
            @Override
            public void send(String str) {
                System.out.println("消息发送："+str);
            }
        };

        msg.send("爱你哟！");
    }
}
