package 第2节_Thread类实现多线程;
//范例：多线程主体类
//线程的主体类（继承Thread类）
public class MyThread extends Thread{
    private String title;
    public MyThread(String title){
        this.title=title;
    }


    @Override
    public void run() {  //线程的主方法
        for(int x=0;x<10;x++){
            System.out.println(this.title+"运行,x="+x);
        }
    }
}


