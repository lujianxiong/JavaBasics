package Daxiong.第7节_方法引用.引用构造方法;

public class Person {
     private String name;
     private int age;
     public Person (String name,int age){
         this.age = age;
         this.name = name;
     }

     //setter、getter略

    public String toString(){
         return "姓名："+this.name+"、年龄："+this.age;
    }
}
