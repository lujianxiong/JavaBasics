package 第16节_集合输出_使用foreach输出;
//范例：使用foreach输出
import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("Hello");
        all.add("World");
        all.add("Daxiong～");
        for (String str : all){
            System.out.print(str+"、");
        }
    }
}
