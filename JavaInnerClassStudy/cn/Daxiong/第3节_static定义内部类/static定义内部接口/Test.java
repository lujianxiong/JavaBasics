package Daxiong.第3节_static定义内部类.static定义内部接口;

public class Test {
    public static void main(String[] args) {
        IMessageWrap.send(new IMessageWrap.DefaultMessage(),new IMessageWrap.NetMessage());

        //通过IMessageWrap接口名直接调用static方法send，static定义的内部类的实例化方式：new  外部类.内部类()
        //DefaultMessage implements IMessageWrap.IMessage,实例化的时候自动向上转型
    }
}
