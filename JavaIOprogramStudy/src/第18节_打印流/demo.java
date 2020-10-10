package 第18节_打印流;
//范例：打印流的设计思想（模仿类库）
import java.io.File;
import java.io.FileOutputStream;

public class demo {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"hello"+File.separator+"ainiyou.txt");   //定义操作文件
        PrintUtil printUtil = new PrintUtil(new FileOutputStream(file));   //在这里传入OutputStream的子类实例化对象，给用户可以选择的权利
        printUtil.println("姓名：小强");
        printUtil.print("年龄：");
        printUtil.println(80);
        printUtil.close();
    }
}
