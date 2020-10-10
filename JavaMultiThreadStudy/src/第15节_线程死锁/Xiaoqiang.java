package 第15节_线程死锁;

public class Xiaoqiang {
    public synchronized void say(Wangjian wj){
        System.out.println("【Xiaoqiang】：让我先过，我在付钱！");
        wj.get();
    }

    public synchronized void get(){
        System.out.println("【Xiaoqiang】：逃过一劫，可以继续送快餐了");
    }
}
