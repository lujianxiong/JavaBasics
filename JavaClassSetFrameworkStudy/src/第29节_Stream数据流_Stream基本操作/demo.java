package 第29节_Stream数据流_Stream基本操作;
//范例：Stream基本操作
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) throws Exception{
        List<String> all = new ArrayList<>();
        Collections.addAll(all,"Java","JavaScript","Python","Ruby","Go");
        Stream<String> stream = all.stream();  //获得Stream接口对象
        //count方法返回的是long类型,大数据时代没有int了

        //要求将每一个元素的字母变为小写字母,而后判断字j是否存在,并计算j的个数
        System.out.println(stream.filter((ele)->ele.toLowerCase().contains("j")).count());     //函数式编程一行语句可以省去大括号

    }
}
