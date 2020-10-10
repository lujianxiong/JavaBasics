package 第7节_线程的命名和取得;
//范例：观察线程的命名操作：
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread,"线程A").start();    //设置线程的名字
        new Thread(myThread).start();                   //未设置
        new Thread(myThread).start();                   //未设置
        new Thread(myThread).start();                   //未设置
        new Thread(myThread).start();                   //未设置
        new Thread(myThread).start();                   //未设置
        new Thread(myThread).start();                   //未设置
        new Thread(myThread).start();                   //未设置
        new Thread(myThread,"线程B").start();    //设置线程名字

    }
}
