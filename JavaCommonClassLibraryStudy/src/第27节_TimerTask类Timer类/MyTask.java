package 第27节_TimerTask类Timer类;

import java.util.TimerTask;
//任务主体
public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"、定时任务执行，当前时间："+System.currentTimeMillis());
    }
}
