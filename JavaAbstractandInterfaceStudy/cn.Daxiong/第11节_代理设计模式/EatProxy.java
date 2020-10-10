package 第11节_代理设计模式;
//服务代理
public class EatProxy implements IEat{

    private IEat eat;  //为吃而服务

    public EatProxy(IEat eat){  //一定要有一个代理项
        this.eat = eat;
    }

    public void prepare(){  //准备过程
        System.out.println("【代理内容】1、精心购买食材");
        System.out.println("【代理内容】2、小心地处理食材");
    }

    public void clear(){
        System.out.println("【代理内容】3、收拾碗筷");
    }

    //具体实现
    @Override
    public void get() {
        //覆写接口的抽象方法，将代理操作和核心操作有序调用
        this.prepare();
        this.eat.get();
        this.clear();
    }
}
