package 第24节_transient关键字;
//范例：实现序列化与反序列化
//一个可以被序列化的类
import java.io.Serializable;

public class Person implements Serializable {
    private transient String name;    //给属性加上transient关键字
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //setter、getter略
    @Override
    public String toString() {
        return "姓名："+this.name+"、年龄："+this.age;
    }

}
