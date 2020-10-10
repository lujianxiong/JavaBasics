package Daxiong.第5节_匿名内部类.观察一个程序;

public class MessageImpl implements IMessage{
    @Override
    public void send(String str) {
        System.out.println(str);
    }
}
