package 第11节_Set接口_TreeSet对自定义类排序;
//范例：实现自定义类排序
import java.util.Set;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
        Set<Person> all = new TreeSet<>();    //TreeSet
        all.add(new Person("张三",19));
        all.add(new Person("李四",19));  //姓名不同，年龄相同
        all.add(new Person("王五",20));
        all.add(new Person("王五",20));  //数据重复
        all.add(new Person("小强",99));
        all.forEach(System.out :: println);
    }
}
