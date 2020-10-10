package 第23节_Arrays数组类;
//范例：数组填充
import java.util.Arrays;
public class demo2 {
    public static void main(String[] args) {
        int data[] = new int[10];
        data[0] = 1;
        data[1] = 2;
        Arrays.fill(data,3);    //将数组的内容全部填充为3
        System.out.println(Arrays.toString(data));   //传统的做法是用利用for循环对数组的内容输出,而Arrays类有toString方法可以转为字符串输出
    }
}
