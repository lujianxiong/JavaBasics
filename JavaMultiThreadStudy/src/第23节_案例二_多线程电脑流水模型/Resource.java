package 第23节_案例二_多线程电脑流水模型;

public class Resource {
    Computer computer;
    private boolean flag = true;    //标记

    public synchronized void make() throws InterruptedException {
        if (this.computer != null){    //如果compuuter不为空
            super.wait();
        }
        Thread.sleep(1000);
        this.computer = new Computer("Daxiong牌电脑",9.9);
        System.out.println("【生产电脑】"+this.computer);
        super.notifyAll();
    }

    public synchronized void get() throws InterruptedException {
        if (this.computer == null){
            wait();
        }
        Thread.sleep(100);
        System.out.println("【搬运电脑】"+this.computer);
        this.computer = null;   //表示computer已经取走了
        notify();
    }
}
