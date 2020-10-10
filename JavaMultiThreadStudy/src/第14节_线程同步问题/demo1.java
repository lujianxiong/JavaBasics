package 第14节_线程同步问题;
//1.利用同步代码块进行处理：
public class demo1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread,"票贩子A").start();
        new Thread(myThread,"票贩子B").start();
        new Thread(myThread,"票贩子C").start();
    }
}
