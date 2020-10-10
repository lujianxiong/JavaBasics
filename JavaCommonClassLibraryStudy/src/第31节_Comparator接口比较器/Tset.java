package 第31节_Comparator接口比较器;
//范例：Comparator接口实现挽救排序
import java.util.Arrays;

public class Tset {
    public static void main(String[] args) {
        Person per[] = new Person[]{
                new Person("小强-A",80),
                new Person("小强-B",50),
                new Person("小强-c",100),
                new Person("小强-D",90),
                new Person("小强-E",20),
        };
        Arrays.sort(per,new PersonComparator());    //实例化一个Comparator比较器实现类对象
        System.out.println(Arrays.toString(per));
    }

}
