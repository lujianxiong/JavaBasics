package 第15节_泛型通配符;
//泛型的上限
public class Test4 {
    public static void main(String[] args) {
        //Message2<String> msgA = new Message2<>();   //在Message2中给泛型设置了上限是Number类，那么只可以使用Number类和它的子类的数据类型
        Message2<Integer> msgB = new Message2<>();

        //msgA.setContent("Da xiong");
        msgB.setContent(520);

        //fun(msgA);
        fun(msgB);
    }

    //使用通配符
    public static void  fun(Message2<? extends Number> temp){
        System.out.println(temp.getContent());
    }
}
