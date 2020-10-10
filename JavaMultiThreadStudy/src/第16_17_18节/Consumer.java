package 第16_17_18节;

public class Consumer implements Runnable{
    private Message msg;
    public Consumer(Message msg){
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int x=0;x<20;x++){
            System.out.println(this.msg.get());
        }
    }
}
