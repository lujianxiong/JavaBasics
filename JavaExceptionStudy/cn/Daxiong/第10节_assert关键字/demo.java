package Daxiong.第10节_assert关键字;

public class demo {
    public static void main(String[] args) {
        int x = 10;
        //中间会经过许多的x变量的操作步骤
        assert x == 100:"x的内容不是100";
        System.out.println(x);
    }
}
