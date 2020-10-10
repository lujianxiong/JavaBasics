package 第5节_反射与单例设计模式;

public class Singleton {
    private static volatile Singleton instance = null;
    private Singleton(){
        System.out.println("【"+Thread.currentThread().getName()+"】************实例化Singleton类对象*********");
    }
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class) {  //这里static方法内部，不可以使用this,得写类名
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    //在上面这个方法中的同步，其实就同步一次就可以了，不用每次调用都同步处理，否则会程序效率很低
    //第一次进入判断，进行同步，保证第一次只有一个对象实例化，之后再调用，就已经有实例化对象了，直接返回已有的实例化对象即可
    //简单地说就是在实例化对象的时候保持同步就可以了！

    //另外：如果你的对象被实例化的时候，是不是应该立刻与主内存中的对象保持同步，而不应该存副本！
    //因此最好在instence 对象定义的时候加上volatile关键字

    public void print(){
        System.out.println("Daxiong");
    }
}
