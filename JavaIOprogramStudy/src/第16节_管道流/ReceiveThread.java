package 第16节_管道流;
////范例：实现管道操作
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;

public class ReceiveThread implements Runnable {
    private PipedInputStream input;

    public ReceiveThread() {
        this.input = new PipedInputStream();
    }

    @Override
    public void run() {
        byte data[] = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();   //实例化内存流对象
        try {
            while ((len = this.input.read(data)) != -1){
                bos.write(data,0,len);    //所有的数据保存在内存输出流
            }
            this.input.read(data);
            System.out.println("{" + Thread.currentThread().getName() + "：接受消息}\n" + new String(bos.toByteArray()));
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public PipedInputStream getInput() {
        return input;
    }
}
