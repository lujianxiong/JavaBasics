package 第23节_Map接口_Iterator输出Map集合;
//范例：利用Iterator输出Map集合
//Map集合迭代输出的标准形式
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        Set<Map.Entry<String,Integer>> set = map.entrySet();   //通过entrySet()方法将Map集合变为Set集合
        Iterator<Map.Entry<String,Integer>> iter = set.iterator();  //
        while (iter.hasNext()){
            Map.Entry<String,Integer> me = iter.next();
            System.out.println(me.getKey()+"="+me.getValue());
        }


    }
}
