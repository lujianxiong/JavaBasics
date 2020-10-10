package 第5节_List接口_ArrayList保存自定义类对象;

public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //setter、getter略

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Person)){
            return false;
        }
        Person per = (Person)obj;
        return this.name.equals(per.name) && this.age == per.age;
    }

    @Override
    public String toString() {
        return "姓名："+this.name+"、年龄："+this.age;
    }
}
