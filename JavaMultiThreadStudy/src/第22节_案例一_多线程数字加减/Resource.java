package 第22节_案例一_多线程数字加减;

//定义一个操作的资源
public class Resource {
    private volatile int num = 0;    //进行加减操作的数据
    private boolean flag = true;   //加减的切换
    //flag = true 表示可以进行加法操作，不可以进行减法操作
    //flag = false 表示可以进行减法操作，不可以进行加法操作

    //加法操作
    public synchronized void add() throws InterruptedException {
        if (this.flag == false) {    //如果flag为false，则不能进行加法，必须等待
            super.wait();
        }
        Thread.sleep(100);
        this.num++;
        try {
            System.out.println("【加法操作 - " + Thread.currentThread().getName() + "】: num = " + num);
        }finally {
            this.flag = false;
            super.notifyAll();
        }

    }

    //减法操作
    public synchronized void sub() throws InterruptedException {
        if (this.flag == true) {    //如果flag为true，则不能进行减法，必须等待
            super.wait();
        }
        Thread.sleep(200);
        this.num--;
        try {
            System.out.println("【减法操作 - " + Thread.currentThread().getName() + "】: num = " + num);
        }finally {
            this.flag = true;
            super.notifyAll();
        }
    }
}
