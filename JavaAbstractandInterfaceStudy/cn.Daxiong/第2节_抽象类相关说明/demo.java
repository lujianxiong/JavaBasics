package 第2节_抽象类相关说明;

public class demo {
    public static void main(String[] args) {
        Message msg = new DatabaseMessage("客户消息");  //向上转型，实例化一个父类的对象
        System.out.println(msg.getConnectInfo());
        System.out.println(msg.getType());
    }
}
