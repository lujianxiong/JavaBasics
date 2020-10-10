package 第15节_线程死锁;

public class Wangjian {
    public synchronized void say(Xiaoqiang xq){
        System.out.println("【Wangjian】：此路是我开，要想从此过，留下10块钱");
        xq.get();
    }

    public synchronized void get(){
        System.out.println("【Wangjian】：得到了10块钱，可以买饭吃了，于是让出来路");
    }
}
