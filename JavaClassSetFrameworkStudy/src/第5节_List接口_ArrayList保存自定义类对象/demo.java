package 第5节_List接口_ArrayList保存自定义类对象;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<Person> all = new ArrayList<Person>();    //泛型简化是1.7之后提供的，用的时候最好还是加上
        all.add(new Person("张三",30));
        all.add(new Person("李四",16));
        all.add(new Person("小强",78));
        System.out.println(all.contains(new Person("小强",78)));    //查不到小强  【但当我们重新覆写了equals方法之后就可以实现了】
        all.remove(new Person("小强",78));    //删除不掉   【但当我们重新覆写了equals方法之后就可以实现了】

        all.forEach(System.out :: println);  //使用方法引用代替了消费型的接口
    }
}

//forEach中接受的类型是Consumer的泛型结构，Consumer<T>接口是函数式接口
//  这行代码：  all.forEach(System.out :: println);   等同于下面的这些代码 【是下面这种写法的缩写形式】
// all.forEach(x -> {
//            System.out.println(x);
//        });