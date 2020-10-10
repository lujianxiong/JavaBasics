package 第11节_线程的礼让;

public class demo {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();    //获得主线程

        //main方法创建的子线程
        Thread thread = new Thread(()->{
            for (int x=0;x<10;x++){
                if (x%3 == 0){
                    Thread.yield();    //线程礼让
                    System.out.println("玩耍的线程礼让执行");
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
        for (int x=0;x<10;x++){
            Thread.sleep(100);
            System.out.println("【霸道的main线程】number = "+x);
        }

    }
}
