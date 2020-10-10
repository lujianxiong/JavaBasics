package 第28节_集合工具类_Collections工具类;
//范例：使用Collections操作List集合
//Collectins中的addAll方法
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        //all.add("");   一般来说我们是这样操作
        Collections.addAll(all,"Hello","World","Daxiong～");    //利用Collections追加一组数据
        System.out.println(all);
    }
}
