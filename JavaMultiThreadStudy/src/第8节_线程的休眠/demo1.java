package 第8节_线程的休眠;
//线程休眠的异常必须强制处理
public class demo1 {
    public static void main(String[] args) {
        new Thread(()->{
            for (int x=0;x<10;x++){
                System.out.println(Thread.currentThread().getName()+"、x = "+x);
                try {
                    Thread.sleep(1000);    //暂缓执行（每1000毫秒执行一次，即1秒执行一次）
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"线程对象").start();
    }
}
