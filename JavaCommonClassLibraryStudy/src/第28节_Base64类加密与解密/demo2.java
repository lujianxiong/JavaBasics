package 第28节_Base64类加密与解密;
//实现盐值加密
import java.util.Base64;

public class demo2 {
    public static void main(String[] args) {
        String salt = "DaxiongJava";
        String msg = "www.Daxiong.com"+"{"+salt+"}";   //给数据增加 盐值
        String enMsg = new String(Base64.getEncoder().encode(msg.getBytes()));   //注意:encode只能接受字节数组，需要getBytes
        System.out.println(enMsg);
        String oldMsg = new String(Base64.getDecoder().decode(enMsg));
        System.out.println(oldMsg);
    }
}

//这时候稍微安全一点，不像以前直接加码出来就是数据