package 第7节_接口基本定义;
//实例1：定义一个接口并实例化
public class Test {
    public static void main(String[] args) {
        IMessage msg = new MessageImpl();   //向上转型调用子类方法实例化一个接口对象
        System.out.println(msg.getInfo());
        System.out.println(IMessage.INFO);  //通过类名称调用直接输出全局静态常量

    }
}
