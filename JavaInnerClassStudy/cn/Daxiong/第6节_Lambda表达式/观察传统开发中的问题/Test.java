package Daxiong.第6节_Lambda表达式.观察传统开发中的问题;

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
//在这个程序里面，实际上核心功能就一行语句，“ System.out.println("消息发送："+str);”，
//但是为了这一行核心语句，我们依然需要按照完整的面向对象设计结构进行开发，于是这些问题
//随着技术的不断发展也越来越突出，Java不得不提供Lambda表达式。