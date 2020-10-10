package 第43节_国家代码与信息显示_类库案例七;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (!"".equals(x)) {
            MessageUtil m = new MessageUtil();
            System.out.println(m.getMessage(x));
        }
    }
}
