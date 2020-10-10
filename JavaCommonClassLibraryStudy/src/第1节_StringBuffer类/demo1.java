package 第1节_StringBuffer类;
//String类对象引用传递
public class demo1 {
    public static void main(String[] args) {
        String str = "Hello";
        change(str);
        System.out.println(str);
        //输出Hello    （内容并没有修改）
    }

    public static void change(String temp){
        temp += "World";
    }
}
