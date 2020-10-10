package 第39节_Email正则验证_类库案例三;
//定义一个专门的验证程序类
public class Validator {
    private Validator(){}   //构造方法私有化
    public static boolean isEmail(String email){
        if (email == null || "".equals(email)){    //数据为空
            return false;
        }
        String regex = "\\w+@\\w+\\.\\w+";  //1143936981@qq.com
        return email.matches(regex);
    }
}

//          \w：匹配字母、数字、下划线；等价于[a-zA-Z_0-9]
//          表达式+：表示该正则表达式可以出现1次或多次
//          正则标记都需要转义，不转义则视为普通字符，转义符号为\
//          在正则中 “\\”：匹配“\”，因此\\w, \\. 这样搭配使用