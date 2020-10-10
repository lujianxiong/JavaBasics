package Daxiong.第4节_方法中定义内部类.旧版本_方法中定义内部类;
//JDK1.8以前  在方法中定义内部类
public class Outer {
    private String msg = "Daxiong";

    public void fun(final long time){   //JDK1.8以前 这里必须加上final
        final String info = "爱你哟";    //这里也必须加上final，如果不加，内部类无法访问
                                         //我的JDK刚好是1.8,不加也没事，JVM会做优化处理的

        class Inner{    //在方法中定义内部类
            public void print(){
                System.out.println(Outer.this.msg);
                System.out.println(time);
                System.out.println(info);
            }
        }

        new Inner().print();   //方法中直接实例化内部类对象
    }
}
