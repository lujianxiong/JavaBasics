package 第3节_模板设计模式;

public class Demo {
    public static void main(String[] args) {
        Action robotAction = new Robot();
        Action personAction = new Person();
        Action pigAction = new Pig();

        System.out.println("----------------- 机器人行为 -----------------");
        robotAction.command(Action.SLEEP);  //机器人的休息为空方法，所以没有输出
        robotAction.command(Action.WORK);

        System.out.println("----------------- 人类的行为 -----------------");
        personAction.command(Action.EAT+Action.SLEEP+Action.WORK);

        System.out.println("----------------- 猪类的行为 -----------------");
        pigAction.work();   //猪的工作为空方法，所以没有输出
        pigAction.sleep();

    }
}
