package 第18节_Map接口_HashMap;

import java.util.HashMap;
import java.util.Map;

public class demo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        System.out.println(map.put("one",1));  //key不重复，返回null
        System.out.println(map.put("one",101));  //key重复，返回旧数据：1
    }
}
