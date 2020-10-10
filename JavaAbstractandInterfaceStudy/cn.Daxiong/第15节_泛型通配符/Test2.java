package 第15节_泛型通配符;

public class Test2 {
    public static void main(String[] args) {
        Message<String> msg = new Message<>();
        Message<Integer> msg2 = new Message<>();

        msg.setContent("xiong");
        msg2.setContent(110);

        fun(msg);
        fun(msg2);
    }
    //fun方法中参数中不使用泛型了带来的问题不止有安全隐患，最严重的是：一旦不设置泛型就意味着方法可以对数据进行修改了
    public static void  fun(Message temp){
        temp.setContent(1.2);
        System.out.println(temp.getContent());
    }
}
