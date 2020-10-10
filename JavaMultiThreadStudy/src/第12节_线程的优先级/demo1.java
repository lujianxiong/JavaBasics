package 第12节_线程的优先级;
//范例：观察优先级
public class demo1 {
    public static void main(String[] args) {
        Runnable run = ()->{
            for (int x=0;x<5;x++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"执行.");
            }
        };

        Thread threadA = new Thread(run,"线程对象A");
        Thread threadB = new Thread(run,"线程对象B");
        Thread threadC = new Thread(run,"线程对象C");
        threadA.setPriority(Thread.MIN_PRIORITY);
        threadB.setPriority(Thread.MIN_PRIORITY);
        threadC.setPriority(Thread.MAX_PRIORITY);


        threadA.start();
        threadB.start();
        threadC.start();

    }
}
