package 第8节_接口定义加强.接口中定义普通方法default;

import 第8节_接口定义加强.接口中定义普通方法default.IMessage;
import 第8节_接口定义加强.接口中定义普通方法default.MessageImpl;

//范例：接口中定义普通方法(default)
public class Test {
    public static void main(String[] args) {
        IMessage msg = new MessageImpl();
        if(msg.connect()){
            System.out.println(msg.message());
        }

    }
}
