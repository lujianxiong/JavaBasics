package 第23节_序列化与反序列化;
//范例：实现序列化与反序列化
//一个可以被序列化的类
import java.io.Serializable;

public class Person implements Serializable {  //标注序列化的功能
    private String name;
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
