package 第27节_IO编程案例三_字符串逆序显示;
//测验逆序输出实验用的
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] res = new String[]{"1","2","3","4","5"};
        int center = res.length/2;
        int head = 0;
        int tail = res.length - 1;
        for (int i = 0; i < center; i++) {
            String temp = res[head];
            res[head] = res[tail];
            res[tail] = temp;
            head++;
            tail--;
        }
        System.out.println(Arrays.toString(res));
    }
}
