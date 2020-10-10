package Daxiong.第6节_Lambda表达式.Lambda表达式的使用;

public class Test {
    public static void main(String[] args) {
        IMessage msg = (str)->{
            System.out.println("发送消息："+str);  //实现IMessage中send方法
        };
        msg.send("爱你哟");
    }
}
