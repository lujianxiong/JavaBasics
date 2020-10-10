package 第2节_CharSequence接口;
//CharSequence接口　字符串截取
public class demo2 {
    public static void main(String[] args) {
        CharSequence str = "www.Daxiong.com";
        CharSequence sub = str.subSequence(4,11);
        System.out.println(sub);
    }
}
