package 第13节_线程同步问题的引出;

public class demo1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread,"票贩子A").start();
        new Thread(myThread,"票贩子B").start();
        new Thread(myThread,"票贩子C").start();
    }
}
