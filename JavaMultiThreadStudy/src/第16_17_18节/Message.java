package 第16_17_18节;

public class Message {
    private String title;
    private String content;
    private boolean flag = true;    //表示生产或消费的形式
    //flag = true：允许生产，但是不允许消费。
    //flag = false：允许消费，不允许声场。

    public synchronized void set(String titile, String content)  {
        if (flag == false) {    //flag = false,此时无法生产  —> 等待
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.title = titile;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;

        this.flag = false;    //生产完成
        super.notify();    //唤醒等待的消费的线程（有就唤醒，没有就没反应）
    }

    public synchronized String get() {
        if (flag == true){    //flag = true：此时允许生产，不允许消费 ->等待
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            return this.title + " - " + this.content;
        }finally {   //执行到这一步，不管怎样都要将flag变为true
            flag = true;   //继续生产
            super.notify();   //唤醒等待线程
        }
    }

}

//记住一点：throw的异常终归是要处理的，与其往上抛得几个类都得catch，不如就在一个类中处理掉！