package 第19节_Map接口_LinkedHashMap;
//范例：使用LinkedHashMap
//存储的顺序是增加数据的顺序
import java.util.LinkedHashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("one",101);    //key重复
        map.put(null,0);    //key为null
        map.put("zero", null);    //value为null
        System.out.println(map);  //key不存在
    }
}
