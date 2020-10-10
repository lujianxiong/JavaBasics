package 第28节_IO编程案例四_类对象排序处理;

import java.util.Arrays;

public class IOCaseDemo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Factory.getInstance().getData()));  //要将数组转字符串输出
    }
}
