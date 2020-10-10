package 第11节_代理设计模式;
//定义吃本身这个操作
public class EatReal implements IEat{
    @Override
    public void get() {
        //这个覆写的get方法是核心操作
        System.out.println("【真实主题】得到一份食物，开始品尝美味");
    }
}
