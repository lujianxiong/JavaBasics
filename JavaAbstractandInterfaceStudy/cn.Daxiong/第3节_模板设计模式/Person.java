package 第3节_模板设计模式;

public class Person  extends Action{
    @Override
    public void eat() {
        System.out.println("饿得时候安静地坐下吃饭。");
    }

    @Override
    public void sleep() {
        System.out.println("安静地躺下，慢慢地睡着，做着美美的梦。");
    }

    @Override
    public void work() {
        System.out.println("人是高级闹类动物，有想法地工作");
    }
}
