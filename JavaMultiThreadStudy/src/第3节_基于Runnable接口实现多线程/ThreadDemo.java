package 第3节_基于Runnable接口实现多线程;
//传统做法
public class ThreadDemo {
    public static void main(String[] args) {
        Thread threadA = new Thread(new MyThread("线程A"));
        Thread threadB = new Thread(new MyThread("线程B"));
        Thread threadC = new Thread(new MyThread("线程C"));
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
