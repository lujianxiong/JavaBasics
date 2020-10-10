package 第29节_Stream数据流_Stream基本操作;
//范例：数据采集
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo3 {
    public static void main(String[] args) throws Exception{
        List<String> all = new ArrayList<>();
        Collections.addAll(all,"Java","JavaScript","Python","Ruby","Go");
        Stream<String> stream = all.stream();  //获得Stream接口对象
        //将每一个元素的字母变为小写字母,而后判断字j是否存在,将满足条件的数据收集起来转为List集合
        List<String> result = stream.filter((ele)->ele.toLowerCase().contains("j")).collect(Collectors.toList());    //filter表示过滤
        System.out.println(result);

    }
}
