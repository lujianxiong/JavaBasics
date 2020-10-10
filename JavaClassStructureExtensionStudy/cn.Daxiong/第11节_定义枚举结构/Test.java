package 第11节_定义枚举结构;

public class Test {
    public static void main(String[] args) {
        IMessage msg = Color.RED;
        System.out.println(msg.getMessage());


        //for(Color c:Color.values()){
        //    System.out.println(c.ordinal()+"-"+c.name()+"-"+c);
        //    //Enum类中定义的oridinal和name方法可以调用，说明c是Enum类的对象
        //}
    }
}
