package 第26节_集合工具类_Queue队列;
//范例：PriorityQueue实现队列操作
//进行了比较,弹出的顺序是按照从小到大的顺序
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class demo2 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("X");  //追加队列数据,通过队尾追加
        queue.offer("A");
        queue.offer("Z");
        System.out.println(queue.poll());  //弹出数据:A
        System.out.println(queue.poll());  //弹出数据:X
        System.out.println(queue.poll());  //弹出数据:Z
    }
}
