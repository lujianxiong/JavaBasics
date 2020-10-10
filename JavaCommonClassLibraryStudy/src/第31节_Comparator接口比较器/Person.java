package 第31节_Comparator接口比较器;
//范例：Comparator接口实现挽救排序
//Person类原封不动，不做任何操作
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "【Person对象】姓名："+this.name+"、年龄："+this.age+"\n";  //加了一个换行操作
    }

}
