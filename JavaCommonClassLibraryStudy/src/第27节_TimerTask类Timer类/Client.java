package 第27节_TimerTask类Timer类;

import java.util.Timer;

public class Client {
    public static void main(String[] args) {
        Timer timer = new Timer();   //定时任务
        //定义定时启动
        //timer.schedule(new MyTask(),1000);    //延迟时间设置为0，表示立即启动

        //定义间隔触发：100毫秒后开始执行，每秒执行1次
        timer.scheduleAtFixedRate(new MyTask(),100,1000);
    }
}
