package 第3节_模板设计模式;

public class Robot extends Action{
    @Override
    public void eat() {
        System.out.println("机器人需要接通电源充电。");
    }

    @Override
    public void sleep() {
        //机器人不休息，因此此方法为空
    }

    @Override
    public void work() {
        System.out.println("机器人按照固定的套路进行工作。");
    }
}
