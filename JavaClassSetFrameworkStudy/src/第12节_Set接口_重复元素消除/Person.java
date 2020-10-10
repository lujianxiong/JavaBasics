package 第12节_Set接口_重复元素消除;
//范例：实现重复元素处理

//我们在demo中使用HashSet的时候，发现即使我们覆写了Comparable接口，还是出现了重复数据
//因为TreeSet使用的是Comparable接口进行比较判断
//而hashCode使用的是Object类提供的hashCode和equals方法，因为我们利用开发工具中的生成器来自动生成hashCode和equals方法
import java.util.Objects;

public class Person implements Comparable<Person>{  //比较器
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名："+this.name+"年龄："+this.age;
    }

    @Override
    public int compareTo(Person per) {
        if (this.age < per.age){
            return -1;
        }else if(this.age > per.age){
            return 1;
        }else{
            return this.name.compareTo(per.name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
