package 第14节_线程同步问题;
//1.利用同步代码块进行处理：
public class MyThread implements Runnable {
    private int ticket = 10;    //总票数为10张

    @Override
    public void run() {
        while (true) {
            synchronized (this) {    //每一次只允许一个线程进行访问
                    if (ticket > 0) {
                        try {
                            Thread.sleep(100);    //模拟网络延迟
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "卖票，ticket =" + this.ticket--);
                    } else {
                        System.out.println("###################### 票已抢光 ############################");
                        break;
                    }
            }
        }
    }
}
