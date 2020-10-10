package 第11节_Set接口_TreeSet对自定义类排序;
//范例：实现自定义类排序
//这个类必须要实现Comparable接口，只有实现了此接口才能确认出对象的大小关系

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

}
