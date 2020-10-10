package 第10节_工厂设计模式;

public class Client {
    public static void main(String[] args) {
        IFood food1 = Factory.getIntense("bread");
        food1.eat();   //吃面包

        IFood food2 = Factory.getIntense("milk");
        food2.eat();   //吃面包
    }
}
