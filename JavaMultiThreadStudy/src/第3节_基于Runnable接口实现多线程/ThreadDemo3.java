package 第3节_基于Runnable接口实现多线程;

public class ThreadDemo3 {
    public static void main(String[] args) {
        for (int x=0;x<3;x++){
            String title = "线程对象-"+x;
            //这里实际上是把创建Runnable对象的过程省去，直接在new Thread中使用Lambda表达式！
            new Thread(()->{
                for (int y=0;y<3;y++){
                    System.out.println(title+"运行，y = "+y);
                }
            }).start();
        }
    }
}
