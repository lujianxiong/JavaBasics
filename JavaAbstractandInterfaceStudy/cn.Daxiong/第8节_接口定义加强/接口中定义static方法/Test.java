package 第8节_接口定义加强.接口中定义static方法;
//范例：接口中定义static方法
public class Test {
    public static void main(String[] args) {
        IMessage msg = IMessage.getInstence();
        System.out.println(msg.message());
    }
}
