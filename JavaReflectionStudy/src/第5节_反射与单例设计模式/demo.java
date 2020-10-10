package 第5节_反射与单例设计模式;

public class demo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(()->{
                Singleton.getInstance().print();
            },"单例消费端 - "+i).start();
        }
        Singleton sinA = Singleton.getInstance();
        sinA.print();
    }
}
