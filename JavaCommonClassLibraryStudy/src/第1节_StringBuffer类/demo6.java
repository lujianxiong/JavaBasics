package 第1节_StringBuffer类;
//StringBuffer类　字符串内容反转：public StringBuffer reverse()
public class demo6 {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello World!");
        System.out.println(buf.reverse());    //实现字符串内容反转
    }
}
