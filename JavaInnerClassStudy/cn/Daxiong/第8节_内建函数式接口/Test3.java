package Daxiong.第8节_内建函数式接口;
//供给型函数式接口:  无参数，有返回值
import java.util.function.*;
public class Test3 {
    public static void main(String[] args) {
        Supplier<String> sup = "DAXIONG"::toLowerCase;  //"DAXIONG"是实例化对象
        System.out.println(sup.get());
    }
}
