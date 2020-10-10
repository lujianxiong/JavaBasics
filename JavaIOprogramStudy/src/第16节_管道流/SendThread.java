package 第16节_管道流;
//范例：实现管道操作
import java.io.IOException;
import java.io.PipedOutputStream;

public class SendThread implements Runnable{
    private PipedOutputStream output;
    public SendThread(){
        this.output = new PipedOutputStream();    //实例化管道输出流
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {      //利用管道实现数据的发送处理
                this.output.write(("【第"+(i+1)+"次信息发送-"+Thread.currentThread().getName()+" 】Daxiong\n").getBytes());
                //OutputStream中的write方法只能接受字节，需要getBytes
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            this.output.close();    //关闭操作
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PipedOutputStream getOuput() {
        return output;
    }
}
