package 第10节_工厂设计模式;
//定义一种食物：面包
public class Bread implements IFood{

    @Override
    public void eat() {
        System.out.println("吃面包");
    }
}
