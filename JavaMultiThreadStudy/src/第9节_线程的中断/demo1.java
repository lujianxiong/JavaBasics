package 第9节_线程的中断;

public class demo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            System.out.println("******************【李四】睡觉补充精力******************");
            try {
                Thread.sleep(10000);    //预计休眠十秒
            } catch (InterruptedException e) {
                System.out.println("【李四】敢打扰我睡觉,我打死你");
            }
            System.out.println("******************【李四】睡足了，出去继续睡小女孩******************");
        });

        thread.start();    //开始睡

        Thread.sleep(1000);    //让他睡一秒
        if (!thread.isInterrupted()){    //判断线程是否中断(没有中断则进行中断处理)
            System.out.println("【张三】我偷偷地打扰一下你的睡眠");
            //这个isInterrupted函数,如果中断则true,没中断则false
            thread.interrupt();    //中断执行
        }
    }
}
