package 第12节_线程的优先级;

public class demo2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());    //查看主线程的优先级
        //输出是 5 . 即主线程属于中等优先级
        System.out.println(new Thread().getPriority());     //查看一个普通线程的优先级
        //输出是 5 .即默认线程的优先级也是中等优先级，与主方法一样。
    }
}
