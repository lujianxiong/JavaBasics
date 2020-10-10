package 第12节_Set接口_重复元素消除;
//范例：实现重复元素处理
import java.util.HashSet;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        Set<Person> all = new HashSet<>();    //hashSet
        all.add(new Person("张三",19));
        all.add(new Person("李四",19));  //姓名不同，年龄相同
        all.add(new Person("王五",20));
        all.add(new Person("王五",20));  //数据重复
        all.add(new Person("小强",99));
        all.forEach(System.out :: println);
    }
}
