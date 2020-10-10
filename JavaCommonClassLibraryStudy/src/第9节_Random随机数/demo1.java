package 第9节_Random随机数;
//范例：产生随机数
import java.util.Random;

public class demo1 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int x=0;x<10;x++){
            System.out.println(rand.nextInt(100));
        }
    }
}
