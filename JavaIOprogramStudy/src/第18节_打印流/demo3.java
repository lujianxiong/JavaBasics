package 第18节_打印流;
//范例：使用PrintWriter格式化输出

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class demo3 {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"hello"+File.separator+"ainiyou.txt");   //定义操作文件
        PrintWriter printUtil = new PrintWriter(new FileOutputStream(file));   //在这里传入OutputStream的子类实例化对象，给用户可以选择的权利
        String name = "小强子";
        int age = 99;
        double salary = 99999999.99999999;
        printUtil.printf("姓名：%s、年龄：%d、薪水：%f",name,age,salary);
        printUtil.close();
    }
}
//在指定文件内输出内容为：   姓名：小强子、年龄：99、薪水：100000000.000000  【它会自动四舍五入】