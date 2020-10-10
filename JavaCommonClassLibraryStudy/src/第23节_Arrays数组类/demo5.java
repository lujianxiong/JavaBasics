package 第23节_Arrays数组类;
//二分查找时间复杂度
import java.util.Arrays;
public class demo5 {
    public static void main(String[] args) {
        int data[] = new int[]{1,5,7,2,3,6,0};
        Arrays.sort(data);
        System.out.println(Math.log(data.length));  //log7 = 1.9    这意味着原来的7次，时间复杂度为logn的话，需要2次
        System.out.println(Math.log(300));    //log300 = 5.7    这就意味原来的300次，如果时间复杂度为logn的话，只需要6次即可
    }
}
