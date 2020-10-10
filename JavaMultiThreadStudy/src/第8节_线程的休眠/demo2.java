package 第8节_线程的休眠;
//范例：产生多个线程对象进行休眠处理
//此时一共产生5个线程对象
public class demo2 {
    public static void main(String[] args) {
        for (int num =0;num<5;num++) {
            new Thread(() -> {
                for (int x = 0; x < 10; x++) {
                    System.out.println(Thread.currentThread().getName() + "、x = " + x);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "线程对象 -"+num).start();
        }
    }
}
