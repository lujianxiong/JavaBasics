package 第41节_IP地址正则验证_类库案例五;

public class Test {
    public static void main(String[] args) {
        String str = "192.168.1.2";   //192.168.1.2
        System.out.println(Validator.validateIP(str));
    }
}
