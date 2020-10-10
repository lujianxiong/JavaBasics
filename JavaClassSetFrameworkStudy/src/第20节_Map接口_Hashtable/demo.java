package 第20节_Map接口_Hashtable;
//范例：观察hashtable子类
//Hashtable进行数据存储的时候，设置的key或value都不允许为null
import java.util.Hashtable;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        Map<String,Integer> map = new Hashtable<>();
        map.put("one",1);
        map.put("two",2);
        map.put("one",101);
        //map.put(null,0);                  【报错】
        //map.put("zero", null);            【报错】
        System.out.println(map);
    }
}
