package 第15节_泛型通配符;
//泛型的下限
public class Test5 {
    public static void main(String[] args) {

        Message3<String> msgB = new Message3<>();
        msgB.setContent("Daxiong");
        fun(msgB);
    }

    //这里super String类之后上面实例化对象给泛型的时候只能写String类和String类的父类Object类
    public static void  fun(Message3<? super String> temp){
        System.out.println(temp.getContent());
    }
}
