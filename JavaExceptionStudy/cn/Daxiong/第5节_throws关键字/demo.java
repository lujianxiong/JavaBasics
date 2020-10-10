package Daxiong.第5节_throws关键字;

public class demo {
    public static void main(String[] args) {
        try {
            System.out.println(MyMath.div(10, 2));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("我能行");
    }
}
