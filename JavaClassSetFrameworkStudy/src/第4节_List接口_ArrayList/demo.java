package 第4节_List接口_ArrayList;
//范例：使用ArrayList实例化List父接口
//List是可以保存重复数据的
import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();  //为List父接口进行实例化
        all.add("Hello");
        all.add("Hello");    //重复数据
        all.add("Wrold!");
        all.add("Daxiong～");
        System.out.println(all);
    }
}
