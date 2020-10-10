package 第22节_案例一_多线程数字加减;

public class Tset {
    public static void main(String[] args) {
        Resource res = new Resource();
        AddThread at = new AddThread(res);
        SubThread st = new SubThread(res);
        new Thread(at,"加法线程 - A").start();
        new Thread(at,"加法线程 - B").start();
        new Thread(st,"减法线程 - X").start();
        new Thread(st,"减法线程 - Y").start();

        //这里开四个线程对象，做不出视频里的效果，总是会出现不是0、1的情况。
        //但是开两个线程对象验证出来是对的。
    }
}
