package 第28节_Base64类加密与解密;
//盐值与多次加密
import java.util.Base64;

public class StringUtil {
    private static final String SALT = "DaxiongJava";    //本类公共的盐值【不可修改、不能对外公布】
    private static final int REPEAT = 5;    //加密次数 （加密次数跑得越多越安全）

    /**
     * 加密处理操作
     * @param str  要加密的字符串，需要与盐值整合
     * @return  加密后的数据
     */
    public static String encode(String str){
        String temp = str+"{"+SALT+"}";
        byte data[] = temp.getBytes();   //将字符串变为字节数组
        for (int x=0;x<REPEAT;x++){
            data = Base64.getEncoder().encode(data);  //每一次把加密后的赋给data数组，encode方法接受字节数组也返回字节数组（即使有垃圾也没办法，也得这样做）
        }
        return new String(data);
    }

    /**
     * 进行解密处理
     * @param str  要解密的内容
     * @return   解密后的原始数据
     */
    public static String decode(String str){
        byte data[] = str.getBytes();
        for (int x=0;x<REPEAT;x++){
            data = Base64.getDecoder().decode(data);
        }
        return new String(data).replaceAll("\\{\\w+\\}","");  //将盐值通过replaceAll使用正则把全部替换为空
    }
}
