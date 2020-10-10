package 第6节_List接口_LinkedList;
//范例：使用LinkedList实现集合操作
import java.util.LinkedList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<String> all = new LinkedList<String>();
        all.add("Hello");
        all.add("Hello");    //重复数据
        all.add("Wrold!");
        all.add("Daxiong～");
        all.add(null);
        System.out.println(all.get(0));  //根据索引取出
        all.forEach(System.out :: println);
    }
}
