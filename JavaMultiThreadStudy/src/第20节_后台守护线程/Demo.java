package 第20节_后台守护线程;

public class Demo {
    public static boolean flag = true;    //定义全局变量

    public static void main(String[] args) throws InterruptedException {
        Thread userThread = new Thread(() -> {
            for (int x = 0; x < 10; x++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在运行、x = " + x);
            }
        }, "用户线程");    //完成核心业务

        Thread daemonThread = new Thread(() -> {
            for (int x = 0; x < 30; x++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在运行、x = " + x);
            }
        }, "守护线程");    //完成核心业务

        daemonThread.setDaemon(true);  //将daemonThread设置为守护线程
        userThread.start();  //启动用户线程
        daemonThread.start();  //启动守护线程

        Thread.sleep(200);    //运行200毫秒
        flag = false;   //停止线程
    }
}
