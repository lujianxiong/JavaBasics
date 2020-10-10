package 第28节_Base64类加密与解密;
//范例：实现加密与解密操作：
import java.util.Base64;

public class demo1 {
    public static void main(String[] args) {
        String msg = "Daxiong";    //要发送的信息
        String encMsg =new String(Base64.getEncoder().encode(msg.getBytes()));    //数据加密; 注意：encode只能传入字节数组，需要getBytes
        System.out.println(encMsg);

        String oldMsg =new String(Base64.getDecoder().decode(encMsg));    //数据解密
        System.out.println(oldMsg);
    }
}
//所有的加密解密返回的都是字节数组，因此，都需要转字符串处理