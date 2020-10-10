package 第15节_泛型通配符;
//泛型的引用传递
public class Test {
    public static void main(String[] args) {
        Message<String> msg = new Message<>();  //如果这里想实例化一个Integer类型的对象，那么fun方法就使用不了，无法实现正常的引用传递
        Message<Integer> msg2 = new Message<>();

        msg.setContent("Daxiong");
        msg2.setContent(110);

        fun(msg);
        fun(msg2);
    }
    //干脆这里不使用泛型了 Message<String> temp
    public static void  fun(Message temp){
        System.out.println(temp.getContent());
    }
    //如果尝试重载现Interge的类型对象实例化，会出错：名称冲突，两个方法存在疑似符号
    //什么是重载？方法的类型相同，方法的参数类型和个数不同
    //public static void  fun(Message<Integer> temp){
    //    System.out.println(temp.getContent());
    //}
}
