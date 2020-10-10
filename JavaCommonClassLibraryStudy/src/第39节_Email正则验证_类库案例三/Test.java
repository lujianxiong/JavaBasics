package 第39节_Email正则验证_类库案例三;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();   //next() 是接收字符串类型
        if (Validator.isEmail(email)){
            System.out.println("输入的Email地址正确！");
        }else {
            System.out.println("Email地址错误！！！！！");
        }
    }
}
