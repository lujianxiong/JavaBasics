package 第21节_Map接口_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class demo {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("C",3);
        map.put("A",1);
        map.put("B",2);
        map.put("D",null);   //value可以为null
        //map.put(null,null);  //key不能为null，因为key要进行排序
        System.out.println(map);

    }
}

//输出结果：
//{A=1, B=2, C=3, D=null}
//可以发现是排过序的，因为String类继承了Comparable接口，如果是我们的自定义类，则需要继承Comparable接口定义排序规则