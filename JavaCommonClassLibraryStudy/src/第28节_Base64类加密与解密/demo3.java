package 第28节_Base64类加密与解密;
//盐值与多次加密
public class demo3 {
    public static void main(String[] args) {
        String str = StringUtil.encode("www.Daxiong.com");
        System.out.println(StringUtil.decode(str));
    }
}
