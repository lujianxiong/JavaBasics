package 第24节_竞争抢答器;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread mt = new MyThread();
        FutureTask<String> taskA = new FutureTask<>(mt);
        FutureTask<String> taskB = new FutureTask<>(mt);
        FutureTask<String> taskC = new FutureTask<>(mt);
        new Thread(taskA,"竞赛者A").start();
        new Thread(taskB,"竞赛者B").start();
        new Thread(taskC,"竞赛者C").start();
        System.out.println(taskA.get());
        System.out.println(taskB.get());
        System.out.println(taskC.get());

    }
}
