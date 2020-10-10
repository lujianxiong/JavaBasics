package 第5节_装箱与拆箱;
//观察包装类的相等判断处理
public class demo4 {
    public static void main(String[] args) {
        Integer x = 127;
        Integer y = 127;
        System.out.println(x == y);    //true

        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);    //false

        Integer p = -128;
        Integer q = -128;
        System.out.println(p == q);    //true

        Integer m = -129;
        Integer n = -129;
        System.out.println(m == n);    //false
        System.out.println(x.equals(y));    //true

        //一位是从-128～127，如果超过这个范围就占了两位了,不能使用 == 去比较
        //所有类都是Object类的子类，所有类都支持equals
        //总结：包装类需要考虑占位的长度，如果超过一位，就需要使用equals比较，如果不超过则可以使用“==”判断
    }
}