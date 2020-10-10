package 第6节_反射获取类结构信息;

public class Person extends AbstractBase implements IMessageService,IChannelService{

    @Override
    public boolean connect() {
        return true;
    }

    @Override
    public void send() {
        if (this.connect()){
            System.out.println("【信息发送】：Daxiong");
        }
    }
}
