package 第15节_线程死锁;

public class DeadLock implements Runnable{
    private Wangjian jj = new Wangjian();
    private Xiaoqiang xq = new Xiaoqiang();

    @Override
    public void run() {
        jj.say(xq);
    }
    public DeadLock(){
        new Thread(this).start();    //this指的是当前类对象
        xq.say(jj);
    }

    public static void main(String[] args) {
        new DeadLock();
    }
}
