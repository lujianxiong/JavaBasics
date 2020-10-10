package 第1节_StringBuffer类;
//StringBuffer类对象引用传递
public class demo2 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello ");
        change(buffer);
        System.out.println(buffer.toString());
    }

    public static void change(StringBuffer buffer){
        buffer.append("World!");
    }
}
