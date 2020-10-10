package 第37节_StringBuffer类案例_类库案例一;

public class demo {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        for (int x = 'a';x <='z';x++){    //数字和字符是可以转换的，通过ASCII码
            buf.append((char)x);    //这里给它转个型，变成字符
        }
        buf.reverse();    //字符串内容反转
        buf.delete(0,5);    //删除前5个字符  (第五个处结束，不删除第五个)
        System.out.println(buf);


    }
}
