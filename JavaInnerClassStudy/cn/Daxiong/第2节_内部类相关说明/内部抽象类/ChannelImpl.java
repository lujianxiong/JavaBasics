package Daxiong.第2节_内部类相关说明.内部抽象类;
//观察内部抽象类
public class ChannelImpl implements IChannel{
    @Override
    public void send() {
        AbstractMessage msg = new MessageImpl();
        System.out.println(msg.getContent());
    }

    //内部类继承抽象类
     class MessageImpl extends AbstractMessage{

         @Override
         public String getContent() {
             return "Daxiong";
         }
     }
}
