package 第19节_静态代理设计模式问题分析;

public class demo {
    public static void main(String[] args) {
        IMessage msg = new MessageProxy(new MessageReal());
        msg.send();
    }
}
