package 第7节_线程的命名和取得;

public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());  //获取当前运行状态的线程、进而获取它的名字
                                                               //因为currentThread方法是static方法，不需要实例化对象。直接通过类名调用
    }
}
