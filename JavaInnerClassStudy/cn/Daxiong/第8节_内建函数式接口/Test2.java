package Daxiong.第8节_内建函数式接口;
//消费性函数式接口：  有输入参数，只能进行数据的操作；无返回值
import java.util.function.*;
public class Test2 {
    public static void main(String[] args) {
        Consumer<String> con = System.out::println;
        con.accept("Daxiong");
    }
}
