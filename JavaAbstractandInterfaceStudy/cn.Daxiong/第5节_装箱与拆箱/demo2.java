package 第5节_装箱与拆箱;
//自动装箱与拆箱 (int 与Integer类型)
public class demo2 {
    public static void main(String[] args) {
        Integer obj = 10;  //自动装箱，此时不再关心构造方法来；
        int num = obj;  //自动拆箱
        obj++; //包装类对象可以直接参与数学运算
        System.out.println(num * obj);  //直接进行数学运算并输出
    }
}
