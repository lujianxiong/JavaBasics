package 第7节_接口基本定义;
//范例5：子类继承抽象类并且实现接口
public class Test4 {
    public static void main(String[] args) {
        IMessage msg = new MessageImpl_2();
        System.out.println(msg.getInfo());
    }
}
