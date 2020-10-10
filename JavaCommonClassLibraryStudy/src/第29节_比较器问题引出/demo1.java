package 第29节_比较器问题引出;
//范例：实现对象数组的排序
import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        Integer data [] = new Integer[]{10,9,5,2,20};    //对象数组
        Arrays.sort(data);   //进行数组的排序
        System.out.println(Arrays.toString(data));

    }
}
