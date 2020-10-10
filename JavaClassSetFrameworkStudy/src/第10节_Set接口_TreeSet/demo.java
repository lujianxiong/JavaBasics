package 第10节_Set接口_TreeSet;
//范例：使用TreeSet
import java.util.Set;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
        Set<String> all = new TreeSet<>();
        all.add("你好！");
        all.add("Hello");
        all.add("Hello");  //重复元素
        all.add("World");
        all.add("Daxiong～");
        all.forEach(System.out :: println);
    }
}
