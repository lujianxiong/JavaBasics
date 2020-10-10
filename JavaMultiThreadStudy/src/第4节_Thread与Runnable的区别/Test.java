package 第4节_Thread与Runnable的区别;
//三个线程卖五张票
public class Test {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(mt).start();    //启动第一个线程
        new Thread(mt).start();    //启动第二个线程
        new Thread(mt).start();    //启动第三个线程
    }
}
