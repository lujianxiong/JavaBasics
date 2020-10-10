package 第26节_IO编程案例二_文件保存;
//其实BufferReader比Scanner在输入这块更规范些（就比如回车Scanner识别不了）
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUtil2 {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private InputUtil2(){}  //不需要构造方法，私有化
    public static String getString(String prompt){
        String str = null;
        boolean flag = true;
        while (flag){
            System.out.print(prompt);
            try{
                str = INPUT.readLine();
                if (!"".equals(str)) {
                    flag = false;
                } else {
                    System.out.println("输入的内容不允许为空!!!");
                }
            }catch (IOException e){
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
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        int num = 0;
        while (flag) {
            System.out.println(prompt);    //打印提示信息
            String str = null;
            try{
                str = INPUT.readLine();
                if (str.matches("\\d+")) {
                    num = Integer.parseInt(str);
                    flag = false;
                } else {
                    System.out.println("输入的内容不是数字！！");
                }
            }catch (IOException e){
                System.out.println("输入的内容不是数字！！！");
            }
        }
        return num;
    }
}
