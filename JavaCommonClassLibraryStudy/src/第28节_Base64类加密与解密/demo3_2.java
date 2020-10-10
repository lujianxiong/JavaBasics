package 第28节_Base64类加密与解密;
//范例：复杂加密（盐值加密+多次加密）  【没实现成功...】
public class demo3_2 {
    public static void main(String[] args) {
        String str = StringUtil2.encode("www.Daxiong.com");
        System.out.println(StringUtil2.decode(str));
    }
}
