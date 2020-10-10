package 第15节_泛型通配符;
//使用通配符
public class Test3 {
    public static void main(String[] args) {
        Message<String> msgA = new Message<>();
        Message<Integer> msgB = new Message<>();

        msgA.setContent("Daxiong");
        msgB.setContent(520);

        fun(msgA);
        fun(msgB);
    }

    //使用通配符
    public static void  fun(Message<?> temp){
        System.out.println(temp.getContent());
    }
}
