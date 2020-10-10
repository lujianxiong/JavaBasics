package 第26节ThreadLocal类.多线程的影响;

public class Client {
    public static void main(String[] args) {
        //第一个线程
        new Thread(()->{
            Message msg = new Message();   //实例化消息对象
            msg.setInfo("第一个线程的消息");    //设置要发送的内容
            Channel.setMessage(msg);     //设置要发送的消息
            Channel.send();   //发送消息
        },"消息发送者A").start();

        //第二个线程
        new Thread(()->{
            Message msg = new Message();   //实例化消息对象
            msg.setInfo("第二个线程的消息");    //设置要发送的内容
            Channel.setMessage(msg);     //设置要发送的消息
            Channel.send();   //发送消息
        },"消息发送者B").start();

        //第三个线程
        new Thread(()->{
            Message msg = new Message();   //实例化消息对象
            msg.setInfo("第三个线程的消息");    //设置要发送的内容
            Channel.setMessage(msg);     //设置要发送的消息
            Channel.send();   //发送消息
        },"消息发送者C").start();

    }
}

//运行多次，一次不靠谱，有可能发现不出问题