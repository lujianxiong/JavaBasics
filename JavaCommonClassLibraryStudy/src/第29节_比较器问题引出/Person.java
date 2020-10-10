package 第29节_比较器问题引出;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //setter\getter略


    @Override
    public String toString() {
        return "【Person对象】姓名："+this.name+"、年龄："+this.age+"\n";  //加了一个换行操作
    }
}
