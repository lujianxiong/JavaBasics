package 第4节_List接口_ArrayList;
//范例：利用forEach()方法输出（不是标准输出，正常开发不会用它的）
import java.util.ArrayList;
import java.util.List;

public class demo3 {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        System.out.println("集合是否为空？"+all.isEmpty()+"、集合元素个数："+all.size());
        all.add("Hello");
        all.add("Hello");
        all.add("Wrold!");
        all.add("Daxiong～");
        all.remove("Hello");  //删除元素【顺序删除】
        System.out.println("集合是否为空？"+all.isEmpty()+"、集合元素个数："+all.size());
        all.forEach((str)->{
            System.out.print(str+"、");
        });
    }
}
