package 第35节_二叉树数据删除;
//范例：Comparator接口实现挽救排序
//Person类原封不动，不做任何操作
public class Person implements Comparable<Person> {
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

    @Override
    public int compareTo(Person per) {
        return this.age - per.age;   //小就返回负数、大就返回正数、等于就返回0
    }
}
