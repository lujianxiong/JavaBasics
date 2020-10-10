package 第1节_抽象类基本概念;
//使用抽象类
public class demo {
    public static void main(String[] args) {
        Message msg = new DatabaseMessage();  //向上转型
        msg.setType("客户消息");
        System.out.println(msg.getConnectInfo());
        System.out.println(msg.getType());
    }
}
