package 第13节_线程同步问题的引出;

public class MyThread implements Runnable {
    private int ticket = 10;    //总票数为10张

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);    //模拟网络延迟
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"卖票，ticket ="+this.ticket--);
            }else{
                System.out.println("####################### 票已抢光 #############################");
                break;
            }
        }
    }
}
