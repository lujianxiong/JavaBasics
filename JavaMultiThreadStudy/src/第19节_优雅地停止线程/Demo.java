package 第19节_优雅地停止线程;

public class Demo {
    public static boolean flag = true;    //定义全局变量
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            long num =0;
            while (flag){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在运行、num = "+num++);
            }
        },"执行线程").start();
        Thread.sleep(200);    //运行200毫秒
        flag = false;   //停止线程
    }
}
