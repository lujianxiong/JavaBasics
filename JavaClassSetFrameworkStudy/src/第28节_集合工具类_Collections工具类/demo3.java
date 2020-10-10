package 第28节_集合工具类_Collections工具类;
//范例：Collectins中binarySearch()二分查找

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class demo3 {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        Collections.addAll(all,"Hello","World","Daxiong～");
        Collections.sort(all);
        System.out.println(all);
        System.out.println(Collections.binarySearch(all,"Daxiong～"));  //二分查找前必须要先排序，查找后返回索引
    }
}
