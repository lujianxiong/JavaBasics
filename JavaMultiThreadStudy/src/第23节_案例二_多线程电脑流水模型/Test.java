package 第23节_案例二_多线程电脑流水模型;

public class Test {
    public static void main(String[] args) {
        Resource res = new Resource();
        new Thread(new Producer(res)).start();
        new Thread(new Consumer(res)).start();

    }
}
