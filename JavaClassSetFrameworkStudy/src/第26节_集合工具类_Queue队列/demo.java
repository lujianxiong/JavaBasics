package 第26节_集合工具类_Queue队列;
//范例：LinkedList实现队列操作
import java.util.LinkedList;
import java.util.Queue;

public class demo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("X");  //追加队列数据,通过队尾追加
        queue.offer("A");
        queue.offer("Z");
        System.out.println(queue.poll());  //弹出数据:X
        System.out.println(queue.poll());  //弹出数据:A
        System.out.println(queue.poll());  //弹出数据:Z
    }
}
