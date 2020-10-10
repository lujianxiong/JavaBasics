package 第4节_Thread与Runnable的区别;

public class MyThread implements Runnable {
    private int ticket = 5;

    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            if (this.ticket>0){
                System.out.println("卖票：ticket = " + this.ticket--);
            }
        }
    }
}
