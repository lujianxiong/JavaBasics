package 第3节_反射实例化对象;

public class Person {
    //任何情况下，只要实例化类对象，一定会自动调用该类中的构造方法
    public Person(){  //无参构造
        System.out.println("******************Person类构造方法******************");
    }

    @Override
    public String toString() {
        return "我是一个人，一个脱离了低级趣味的好人";
    }
}
