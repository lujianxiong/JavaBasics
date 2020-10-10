package 第23节_Map接口_Iterator输出Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//范例：使用foreach输出Map集合
public class demo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        Set<Map.Entry<String,Integer>> set = map.entrySet();   //通过entrySet()方法将Map集合变为Set集合
        for (Map.Entry<String,Integer> temp : set){
            System.out.println(temp.getKey()+"="+temp.getValue());
        }
    }
}
