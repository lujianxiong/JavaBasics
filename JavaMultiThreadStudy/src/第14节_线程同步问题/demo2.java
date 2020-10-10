package 第14节_线程同步问题;
//2.同步方法
public class demo2 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        new Thread(mt,"票贩子A").start();
        new Thread(mt,"票贩子B").start();
        new Thread(mt,"票贩子C").start();
    }
}
