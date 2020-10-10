package 第17节_Map接口_Map接口简介;
//范例：观察Map集合的特点
//JDK1.9才可以用of静态方法，和之前的List一样
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        //Map<String,Integer> map = Map.of("one",1,"two",2);   //正常存储数据
        //System.out.println(map);

        //Map<String,Integer> map = Map.of("one",1,"two",2,"one",1);   //存储重复数据，异常
        //System.out.println(map);

        //Map<String,Integer> map = Map.of("one",1,"two",2,null,0);   //空指向异常
        //System.out.println(map);
    }
}
