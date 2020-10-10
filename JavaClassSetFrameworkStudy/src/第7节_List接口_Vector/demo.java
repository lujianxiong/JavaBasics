package 第7节_List接口_Vector;
//范例：Vector类使用
import java.util.List;
import java.util.Vector;

public class demo {
    public static void main(String[] args) {
        List<String> all = new Vector<>();
        all.add("Hello");
        all.add("Hello");    //重复数据
        all.add("Wrold");
        all.add("Daxiong～");
        all.add(null);

        all.forEach(System.out :: println);
    }
}
