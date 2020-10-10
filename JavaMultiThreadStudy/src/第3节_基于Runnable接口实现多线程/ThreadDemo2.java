package 第3节_基于Runnable接口实现多线程;
//引入Lambda表达式
public class ThreadDemo2 {
    public static void main(String[] args) {
        for (int x=0;x<3;x++){
            String title = "线程对象-"+x;
            Runnable run = ()->{
              for (int y=0;y<3;y++){
                  System.out.println(title+"运行，y = "+y);
              }
            };
            new Thread(run).start();
        }
    }
}
//Lambda实质上是将继承Runable的类中run方法的具体实现放在Lambda表达式中
//这种操作可以简化！！