package 第10节_线程的强制执行;
//范例：观察强制执行的程序。
public class demo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();    //获得主线程

        //main方法创建的子线程
        Thread thread = new Thread(()->{
            for (int x=0;x<100;x++){
                if (x==3){
                    try {
                        mainThread.join();   //霸道的线程独占执行
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"执行:x="+x);
            }
        },"玩耍的线程");
        thread.start();

        //主线程
        for (int x=0;x<100;x++){
            Thread.sleep(100);
            System.out.println("【霸道的main线程】number = "+x);
        }
    }
}
