package 第5节_Callable接口实现多线程;

import java.util.concurrent.Callable;

public class MyThread implements Callable {
    @Override
    public Object call() throws Exception {
        for (int x=0;x<10;x++){
            System.out.println("****************线程执行,x = "+x+"*****************");
        }
        return "线程执行完毕";
    }
}
