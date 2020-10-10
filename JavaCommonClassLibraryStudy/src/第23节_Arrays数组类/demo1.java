package 第23节_Arrays数组类;
//范例：观察数组的基本操作
import java.util.Arrays;
public class demo1 {
    public static void main(String[] args) {
        int dataA[] = new int[]{1,2,3};
        int dataB[] = new int[]{1,2,3};
        //System.out.println(Arrays.compare(dataA,dataB));    //我的JDK是1.8的,1.9开始才有Arrays.compare的方法
        System.out.println(Arrays.equals(dataA,dataB));
    }
}
