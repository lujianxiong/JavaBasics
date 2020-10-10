package 第24节_Annotation整合工厂设计模式;
//这个类起到一个包装的作用
//利用Annotation实现了类的使用
@UseMessage(clazz = NetMessageImpl.class)     //如果增加一个接口子类，更换为新的子类，直接在此处更换即可
public class MessageService {
    private IMessage message;
    public MessageService(){
        UseMessage use = MessageService.class.getAnnotation(UseMessage.class);
        this.message = (IMessage) Factory.getInstance(use.clazz());  //直接通过Annotation获取
    }

    public void send(String msg){
        message.send(msg);
    }
}
