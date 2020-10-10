package 第23节_Arrays数组类;
//范例：二分查找成功
import java.util.Arrays;

public class demo4 {
    public static void main(String[] args) {
        int data[] = new int[]{1,5,7,2,3,6,0};
        Arrays.sort(data);     //二分查找前，数组必须经过升序排序
        System.out.println(Arrays.binarySearch(data,1));    //二分查找
        //返回的结果是在排序的数组中，key所在的索引位置
    }
}
