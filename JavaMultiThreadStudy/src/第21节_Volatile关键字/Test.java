package 第21节_Volatile关键字;

public class Test {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(mt,"票贩子A").start();
        new Thread(mt,"票贩子B").start();
        new Thread(mt,"票贩子C").start();

    }
}
