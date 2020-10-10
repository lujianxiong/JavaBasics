package 第1节_StringBuffer类;
//观察StringBuilder　和　StringBuffer
public class demo7 {
    public static void main(String[] args) {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello World!");
        System.out.println(buf.reverse());    //实现字符串内容反转
    }
}
