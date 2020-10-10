package 第13节_集合输出_Iterator迭代输出;
//范例：Iterator输出
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        Set<String> all = new HashSet<>();
        all.add("Hello");
        all.add("World");
        all.add("你好！");
        all.add("Daxiong～");

        Iterator<String> iterator = all.iterator();  //实例化Iterator接口对象
        //知道循环结束条件的循环用while
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
