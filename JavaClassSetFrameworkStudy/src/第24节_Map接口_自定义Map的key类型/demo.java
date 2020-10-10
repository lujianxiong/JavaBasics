package 第24节_Map接口_自定义Map的key类型;
//将自定义类作为Key类型
//自定义类必须要覆写hashCode()和equals()方法
import java.util.HashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        Map<Person,String> map = new HashMap<>();
        map.put(new Person("小强",78),"月上谷");  //使用自定义类作为key
        System.out.println(map.get(new Person("小强",78)));  //通过Key找到Value
    }
}
