package 第16_17_18节;

public class Producer implements Runnable{
    private Message msg;
    public Producer(Message msg){
        this.msg = msg;
    }

    @Override
    public void run() {
        for(int x=0;x<20;x++){
            if (x%2 == 0){  //如果是偶数
                this.msg.set("王建","宇宙大帅哥");
            }else{
                this.msg.set("小高","猥琐第一人");
            }
        }
    }
}
