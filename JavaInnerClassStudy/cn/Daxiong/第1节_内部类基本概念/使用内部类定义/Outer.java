package Daxiong.第1节_内部类基本概念.使用内部类定义;
//内部类的基本结构
public class Outer {    //外部类
    private String msg = "Daxiong";
    public void fun(){    //普通方法
       Inner inner = new Inner();    //实例化内部类对象
        inner.print();     //调用内部类方法
    }

    class Inner{    //在Outer类的内部定义一个内部类Inner
        public void print(){
            System.out.println(Outer.this.msg);
        }
    }
}
