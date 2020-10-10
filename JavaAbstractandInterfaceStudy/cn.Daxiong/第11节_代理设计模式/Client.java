package 第11节_代理设计模式;

public class Client {
    public static void main(String[] args) {
        IEat eat = new EatProxy(new EatReal());
        eat.get();
        //这里最好的方法是结合工厂设计模式来做，暂时先不做这么复杂
    }
}
