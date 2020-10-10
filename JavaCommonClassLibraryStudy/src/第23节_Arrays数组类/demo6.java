package 第23节_Arrays数组类;
//手工编写二分查找
import java.util.Arrays;

public class demo6 {
    public static void main(String[] args) {
        int data[] = new int[]{1,5,7,2,3,6,0,11,13,16,19};
        Arrays.sort(data);
        for (int x=0;x<data.length;x++){
            System.out.println("查找"+data[x]+"  索引："+ArrayUtil.binarySearch(data,data[x]));
        }
        System.out.println(ArrayUtil.binarySearch(data,4));
        System.out.println(ArrayUtil.binarySearch(data,9));

    }
}
