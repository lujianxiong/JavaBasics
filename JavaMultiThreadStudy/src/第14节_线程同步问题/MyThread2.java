package 第14节_线程同步问题;
//2.同步方法
public class MyThread2 implements Runnable {
    private int ticket = 10;

    public synchronized boolean sale() {    //同步方法
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票，ticket =" + this.ticket--);
            return true;
        } else {
            System.out.println("###################### 票已抢光 ############################");
            return false;
        }
    }

    @Override
    public void run() {
        while (this.sale()) {
            ;
        }
    }
}

