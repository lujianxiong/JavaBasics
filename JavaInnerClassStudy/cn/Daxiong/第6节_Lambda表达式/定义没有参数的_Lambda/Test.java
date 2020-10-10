package Daxiong.第6节_Lambda表达式.定义没有参数的_Lambda;
//没有参数的Lambda表达式形式
public class Test {
    public static void main(String[] args) {
        IMessage msg = ()->{
            System.out.println("发送消息：mua");  //实现IMessage中send方法
        };
        msg.send();
    }
}
