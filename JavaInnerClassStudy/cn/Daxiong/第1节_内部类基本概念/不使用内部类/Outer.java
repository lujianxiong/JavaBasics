package Daxiong.第1节_内部类基本概念.不使用内部类;
//观察两个单独的类访问私有属性
public class Outer {
    //思考一：如果msg属性被其他类访问，我们需要提供getter方法
    private String msg = "Daxiong";
    public void fun(){    //普通方法
        //思考五：需要将当前对象Outer传递到Inner类之中
        Inner inner = new Inner(this);    //实例化内部类对象
        inner.print();     //调用内部类方法
    }

    public String getMsg(){
        return this.msg;
    }
}
