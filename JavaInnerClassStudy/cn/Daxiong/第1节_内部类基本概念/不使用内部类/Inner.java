package Daxiong.第1节_内部类基本概念.不使用内部类;
//观察两个单独的类访问私有属性
public class Inner {
    //思考三：Inner这个类对象实例化的时候需要Outer类的引用，所以我们要在这接受Outer类对象的引用
    private Outer outer;
    //思考四：我们应该通过Inner类的构造方法获取Outer类对象
    public Inner(Outer outer){
        this.outer = outer;
    }
    public void print(){
        //思考二：如果想要调用外部类中的getter方法，那么一定得有Outer类的实例化对象
        //这里不能使用new Outer(),因为在Test中会new一个Outer,弄两个太乱了。
        System.out.println(outer.getMsg());  //使用Outer类对象的引用来调用getter方法
    }
}
