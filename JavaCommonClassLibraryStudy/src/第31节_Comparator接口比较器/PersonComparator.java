package 第31节_Comparator接口比较器;
//范例：Comparator接口实现挽救排序
//定义一个Person类的Comparator排序规则
import java.util.Comparator;
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}
