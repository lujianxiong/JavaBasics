package 第18节_Map接口_HashMap;
//范例：观察Map集合的使用
//这是Map集合使用的最标准的处理形式
import java.util.HashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("one",101);    //key重复
        map.put(null,0);    //key为null
        map.put("zero", null);    //value为null
        System.out.println(map.get("one"));  //key存在
        System.out.println(map.get(null));  //key存在
        System.out.println(map.get("ten"));  //key不存在
    }
}
