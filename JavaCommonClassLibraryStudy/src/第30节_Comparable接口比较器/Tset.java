package 第30节_Comparable接口比较器;
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
        Arrays.sort(per);
        System.out.println(Arrays.toString(per));
    }

}
//我们在Person类中实现Comparable接口，实现CompareTo方法的覆写。
//在调用系统的Arrays.sort对Person类型的对象数组进行排序的时候就可以调用覆写的排序规则，对其进行排序！