package 第3节_模板设计模式;

public class Pig extends Action{
    @Override
    public void eat() {
        System.out.println("吃食槽中的人类的剩饭。");
    }

    @Override
    public void sleep() {
        System.out.println("倒地就睡。");
    }

    @Override
    public void work() {
        //猪不工作，因此此方法为空
    }
}
