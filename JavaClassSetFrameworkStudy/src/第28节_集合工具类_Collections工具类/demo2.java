package 第28节_集合工具类_Collections工具类;
//范例：Collections中reverse()方法反转集合

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class demo2 {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        Collections.addAll(all,"Hello","World","Daxiong～");    //利用Collections追加一组数据
        Collections.reverse(all);
        System.out.println(all);
    }
}
