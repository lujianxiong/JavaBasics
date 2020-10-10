package 第13节_集合输出_Iterator迭代输出;
//范例:Iterator接口中的remove删除
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class demo3 {
    public static void main(String[] args) {
        Set<String> all = new HashSet<>();
        all.add("Hello");
        all.add("World");
        all.add("你好！");
        all.add("Daxiong～");

        Iterator<String> iterator = all.iterator();  //实例化Iterator接口对象
        while (iterator.hasNext()){
            String str = iterator.next();
            if ("World".equals(str)){
                iterator.remove();    //删除当前的数据   【一般用的话用Iterator接口的remove】
            }else {
                System.out.println(str);
            }
        }
        System.out.println("***"+all);

    }
}
