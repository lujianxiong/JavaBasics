package 第6节_Cleaner类;

public class Member implements Runnable{
    public Member(){
        System.out.println("【构造】在一个雷电交加的日子里，林强诞生了");
    }

    @Override
    public void run() {     //执行清除的时候，执行的是此操作
        System.out.println("【回收】最终你一定会死的");
    }
}
