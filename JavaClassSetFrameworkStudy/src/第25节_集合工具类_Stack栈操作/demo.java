package 第25节_集合工具类_Stack栈操作;
//范例：实现栈的操作
import java.util.Stack;

public class demo {
    public static void main(String[] args) {
        Stack<String> all = new Stack<>();
        all.push("A");
        all.push("B");
        all.push("C");
        System.out.println(all.pop());
        System.out.println(all.pop());
        System.out.println(all.pop());
        System.out.println(all.pop());    //无数据
    }
}
