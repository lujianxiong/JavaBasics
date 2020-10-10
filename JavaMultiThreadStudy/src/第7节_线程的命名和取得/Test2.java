package 第7节_线程的命名和取得;
//范例：观察一个程序：
public class Test2 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(mt,"线程对象").start();    //通过Thread类调用start方法
        mt.run();    //线程对象直接调用run方法
    }
}
