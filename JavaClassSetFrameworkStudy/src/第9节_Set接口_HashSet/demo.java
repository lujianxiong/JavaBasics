package 第9节_Set接口_HashSet;
//范例：观察HashSet子类
import java.util.HashSet;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        Set<String> all = new HashSet<>();
        all.add("你好！");
        all.add("Hello");
        all.add("Hello");  //重复元素
        all.add("World");
        all.add("Daxiong～");
        all.forEach(System.out :: println);
    }
}
