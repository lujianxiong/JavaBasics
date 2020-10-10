package 第8节_线程的休眠;
//这个等同于demo2
public class demo2_2 {
    public static void main(String[] args) {
        Runnable run = ()->{
                for (int x = 0; x < 10; x++) {
                    System.out.println(Thread.currentThread().getName() + "、x = " + x);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

        for (int num =0;num<5;num++) {
            new Thread(run, "线程对象 -"+num).start();
        }
    }

}
