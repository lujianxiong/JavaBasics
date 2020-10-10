package Daxiong.第4节_方法中定义内部类;

public class Outer {
    private String msg = "Daxiong";

    public void fun(long time){

        class Inner{    //在方法中定义内部类
            public void print(){
                System.out.println(Outer.this.msg);
                System.out.println(time);
            }
        }

        new Inner().print();   //方法中直接实例化内部类对象
    }
}
