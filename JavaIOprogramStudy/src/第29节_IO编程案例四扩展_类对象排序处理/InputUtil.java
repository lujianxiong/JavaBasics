package 第29节_IO编程案例四扩展_类对象排序处理;

import java.util.Scanner;

public class InputUtil {
    private InputUtil(){}  //不需要构造方法，私有化
    public static String getString(String prompt){
        String str = null;
        boolean flag = true;
        while (flag){
            Scanner input = new Scanner(System.in);
            System.out.print(prompt);
            if (input.hasNext()){
                str = input.next().trim();
                if (!"".equals(str)){    //不是空字符串
                    flag = false;
                }else {
                    System.out.println("输入的内容不允许为空!!!");
                }
            }else {
                System.out.println("输入的内容不允许为空!!!");
            }
        }
        return str;
    }

    /**
     * 实现键盘接收数字的操作 【保证输入错误的情况下，可以继续输入】
     * @param prompt    提示信息
     * @return    返回可以使用的数字
     */
    public static int getInt(String prompt){
        //如何能保证我们最终输入正确呢？ 立个flag吧！
        boolean flag = true;
        int num = 0;
        while (flag) {
            Scanner input = new Scanner(System.in);   //这个要放在循环里面
            System.out.println(prompt);    //打印提示信息
            if (input.hasNext("\\d+")) { //这里最好不要写hashNextInt，它会把回车换行当作字符看待。使用正则验证。【hashnext接受的是字符类型】
                num = Integer.parseInt(input.next("\\d+"));    //next传入的是字符串，需要转型
                flag = false;
            } else {
                System.out.println("输入的内容不是数字！！");
            }
        }
        return num;
    }
}
