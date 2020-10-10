package 第8节_接口定义加强.接口中定义普通方法default;

import 第8节_接口定义加强.接口中定义普通方法default.IMessage;

//范例：接口中定义普通方法(default)
public class MessageImpl implements IMessage {
    public String message(){
        return "xiong.blog.csdn.net";
    }
}
