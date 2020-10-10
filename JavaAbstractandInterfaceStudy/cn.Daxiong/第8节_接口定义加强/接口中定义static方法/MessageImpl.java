package 第8节_接口定义加强.接口中定义static方法;
//范例：接口中定义static方法
public class MessageImpl implements IMessage {
    public String message(){
        if(this.connect()){
            return "xiong.blog.csdn.net";
        }
        return "没有消息发送";
    }
}
