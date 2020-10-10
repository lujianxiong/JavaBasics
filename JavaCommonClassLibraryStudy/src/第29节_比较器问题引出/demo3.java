package 第29节_比较器问题引出;

import java.util.Arrays;

public class demo3 {
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
