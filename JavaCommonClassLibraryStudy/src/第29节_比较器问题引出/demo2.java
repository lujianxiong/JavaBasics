package 第29节_比较器问题引出;
//范例：String对象数组排序
import java.util.Arrays;
public class demo2 {
    public static void main(String[] args) {
        String data[] = new String[]{"X","B","A","E","G"};
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
