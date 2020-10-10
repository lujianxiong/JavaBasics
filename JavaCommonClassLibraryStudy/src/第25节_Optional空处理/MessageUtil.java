package 第25节_Optional空处理;

import java.util.Optional;

public class MessageUtil {
    private MessageUtil(){};
    public static Optional<IMessage> getMessage(){
        return Optional.ofNullable(null);    //保存数据可以为空
        //return Optional.of(new MessageImpl())            //保存数据不允许为空
    }

    public static void useMessag(IMessage msg){
        if (msg != null) {
            System.out.println(msg.getContent());    //有可能出现null，导致空指向
        }
    }

}
