package 第1节_StringBuffer类;
//范例：分析一下已有问题。
public class demo3 {
    public static void main(String[] args) {
        String strA = "www.Daxiong.com";
        String strB = "www."+"Daxiong"+".com";
        System.out.println(strA);
        System.out.println(strA == strB);    //比较两个对象的地址

        StringBuffer buf = new StringBuffer();
        buf.append("www.").append("Daxiong").append(".com");
        System.out.println(buf);
    }
}
