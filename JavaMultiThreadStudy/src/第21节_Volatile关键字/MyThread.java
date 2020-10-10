package 第21节_Volatile关键字;
//volatile的正确使用姿势
public class MyThread implements Runnable{
    private volatile int ticket =5;    //直接对内存里的原始数据进行操作

    @Override
    public void run() {
        synchronized (this) {
            while (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "卖票处理，ticket = " + ticket--);
            }
        }
    }
}
