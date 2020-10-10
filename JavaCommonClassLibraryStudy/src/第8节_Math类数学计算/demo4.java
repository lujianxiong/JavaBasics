package 第8节_Math类数学计算;
//取整：Math.round()
public class demo4 {
    public static void main(String[] args) {
        System.out.println(Math.round(-15.5));
        System.out.println(Math.round(-15.51));
        System.out.println(Math.round(15.5));
        System.out.println(Math.round(-1.2));
        System.out.println(Math.round(-1.49));  //-1
        System.out.println(Math.round(-1.50));  //-1
        System.out.println(Math.round(-1.51));  //-2

    }
}
