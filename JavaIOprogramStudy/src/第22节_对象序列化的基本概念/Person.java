package 第22节_对象序列化的基本概念;
//范例：定义一个可以被序列化的类
import java.io.Serializable;

public class Person implements Serializable {  //标注序列化的功能
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    //setter、getter略
    @Override
    public String toString() {
        return "姓名："+this.name+"、年龄："+this.age;
    }

}
