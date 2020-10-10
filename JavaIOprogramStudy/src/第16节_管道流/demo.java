package 第16节_管道流;
//范例：实现管道操作
public class demo {
    public static void main(String[] args) throws Exception{
        SendThread send = new SendThread();
        ReceiveThread receive = new ReceiveThread();
        send.getOuput().connect(receive.getInput());    //进行管道连接
        new Thread(send,"消息发送线程").start();
        new Thread(receive,"消息接收线程").start();

    }
}
