package 第6节_数据类型转换;
//包装类的方法实现String转换boolean
public class demo2 {
    public static void main(String[] args) {
        String str = "true";  //输入除“true” 、“false”以外的其他内容都输出false
        boolean flag = Boolean.parseBoolean(str);  //
        System.out.println(flag);
    }
}
