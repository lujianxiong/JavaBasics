package 第16_17_18节;

public class Test {
    public static void main(String[] args) {
        Message message = new Message();
        new Thread(new Producer(message)).start();    //启动生产者线程
        new Thread(new Consumer(message)).start();      //启动消费者线程
    }
}
