package 第7节_线程的命名和取得;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
//通过子线程实现耗时操作，使用Calloable接口和Lambda表达式返回一个数据。
public class Test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("1.执行操作任务一");
        Callable call= ()->{
            int temp = 0;
            for (int x=0;x<Integer.MAX_VALUE;x++){
                temp+=x;
            }
            return temp;
        };
        FutureTask<Integer> task = new FutureTask<>(call);
        new Thread(task).start();
        System.out.println("【线程返回数据】："+task.get());

        System.out.println("2.执行操作任务二");
        System.out.println("3.执行操作任务三");
        System.out.println("4.执行操作任务四");
    }
}
