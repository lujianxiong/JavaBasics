package 第8节_多例设计模式;
//多例设计模式
public class Test {
    public static void main(String[] args) {
        Color c = Color.getInstance("green");
        System.out.println(c);
    }
}
