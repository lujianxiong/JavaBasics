package 第11_12_13_14节_综合案例一_反射与简单Java类;

//这个类的作用在于将首字母大写。比方说ename属性名称和setEname方法之间，set后面的属性首字母要大写。
public class StringUtils {
    public static String initcap(String str){
        if (str == null || "".equals(str)){
            return str;
        }
        if (str.length() ==1){
            return str.toUpperCase();
        }else{
            return str.substring(0,1).toUpperCase()+str.substring(1);  // 把首字母截取出来，大写转换之后再加上后半部分
        }
    }
}
