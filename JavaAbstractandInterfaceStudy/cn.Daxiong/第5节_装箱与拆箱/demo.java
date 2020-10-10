package 第5节_装箱与拆箱;
//使用包装类的构造方法进行装箱与拆箱
public class demo {
    public static void main(String[] args) {
        Integer obj = new Integer(10);   //装箱
        int num = obj.intValue();    //拆箱
        System.out.println(num * num);
    }
}
