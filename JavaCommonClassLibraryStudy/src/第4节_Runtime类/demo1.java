package 第4节_Runtime类;
//范例：获取Runtime类对象
public class demo1 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();    //获取实例化对象
        System.out.println(run.availableProcessors());    //获取可用进程数
        //出来的是几就是几核CPU
    }
}
