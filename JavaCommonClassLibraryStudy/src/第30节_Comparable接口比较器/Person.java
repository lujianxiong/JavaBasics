package 第30节_Comparable接口比较器;

public class Person implements Comparable<Person>{
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

    @Override
    public int compareTo(Person per) {
        //if (this.age<per.age){
        //    return -1;
        //}else if(this.age>per.age){
        //    return 1;
        //}
        //return 0;

        //上面的方法可以通过一行代码完成：
        return this.age - per.age;   //小就返回负数、大就返回正数、等于就返回0
        //两个换个顺序就是降序
    }
}
