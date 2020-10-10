package 第4节_List接口_ArrayList;
//范例：利用forEach()方法输出（不是标准输出，正常开发不会用它的）
import java.util.ArrayList;
import java.util.List;

public class demo2 {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();  //为List父接口进行实例化
        all.add("Hello");
        all.add("Hello");    //重复数据
        all.add("Wrold!");
        all.add("Daxiong～");
        all.forEach((str)->{
            System.out.print(str+"、");
        });
    }
}
