package 第24节_竞争抢答器;

import java.util.concurrent.Callable;
public class MyThread implements Callable<String> {
    private boolean flag = false;   //抢答处理

    @Override
    public String call() throws Exception {
        synchronized (this){    //数据同步
            if (this.flag == false){    //抢答成功
                this.flag = true;
                return Thread.currentThread().getName()+"抢答成功！";
            }else{
                return Thread.currentThread().getName()+"抢答失败×";
            }
        }
    }
}
