package 第4节_Runtime类;
//范例：观察内存状态；
public class demo2 {
    public static void main(String[] args) throws InterruptedException {
        Runtime run = Runtime.getRuntime();
        System.out.println("【1】MAX_MEMORY:" + run.maxMemory());
        System.out.println("【1】TOTAL_MEMORY:" + run.totalMemory());
        System.out.println("【1】FREE_MEMORY:" + run.freeMemory());

        String str = "";
        for (int x=0;x<10000;x++){
            str+=x;   //产生大量的垃圾空间
        }

        System.out.println("【2】MAX_MEMORY:" + run.maxMemory());
        System.out.println("【2】TOTAL_MEMORY:" + run.totalMemory());
        System.out.println("【2】FREE_MEMORY:" + run.freeMemory());

        Thread.sleep(200);
        //run.gc()     //这个方法和下面的方法是一样的，这个是通过已经获取的Runtime对象直接调用
        Runtime.getRuntime().gc();

        System.out.println("【3】MAX_MEMORY:" + run.maxMemory());
        System.out.println("【3】TOTAL_MEMORY:" + run.totalMemory());
        System.out.println("【3】FREE_MEMORY:" + run.freeMemory());
    }
}