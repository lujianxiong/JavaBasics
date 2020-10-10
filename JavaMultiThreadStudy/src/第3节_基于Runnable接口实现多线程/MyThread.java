package 第3节_基于Runnable接口实现多线程;
//传统做法
public class MyThread implements Runnable{
    private String title;
    public MyThread(String title){
        this.title=title;
    }

    @Override
    public void run() {
        for(int x=0;x<10;x++){
            System.out.println(this.title+"运行,x="+x);
        }
    }
}
