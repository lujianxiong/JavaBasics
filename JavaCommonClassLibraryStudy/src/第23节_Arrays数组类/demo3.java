package 第23节_Arrays数组类;
//二分查找失败案例
import java.util.Arrays;
public class demo3 {
    public static void main(String[] args) {
        int data[] = new int[]{1,5,7,2,3,6,0};    //这个数组不能做二分查找
        System.out.println(Arrays.binarySearch(data,0));
        //返回的是-1，表示不存在，但是0存在于数组中
    }
}
