package 第5节_Callable接口实现多线程;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(new MyThread());
        new Thread(task).start();
        System.out.println("【线程返回数据】："+task.get());
    }
}
