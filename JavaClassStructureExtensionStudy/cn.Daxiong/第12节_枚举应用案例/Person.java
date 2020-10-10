package 第12节_枚举应用案例;

public class Person {
    private String name;
    private int age;
    private Sex sex;

    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String toString(){
        return "姓名："+this.name+"、年龄："+this.age+"、性别："+this.sex;
    }
}
