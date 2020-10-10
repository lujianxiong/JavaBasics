package 第29节_Stream数据流_Stream基本操作;
//范例：观察分页
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo2 {
    public static void main(String[] args) throws Exception{
        List<String> all = new ArrayList<>();
        Collections.addAll(all,"Java","JavaScript","JSP","Json","Python","Ruby","Go");
        Stream<String> stream = all.stream();  //获得Stream接口对象
        //将每一个元素的字母变为小写字母,而后判断字j是否存在,将满足条件的数据收集起来转为List集合
        List<String> result = stream.filter((ele)->ele.toLowerCase().contains("j")).skip(2).limit(2).collect(Collectors.toList());  //跳过两个数据,设置最大取出数据量
        System.out.println(result);

    }
}
