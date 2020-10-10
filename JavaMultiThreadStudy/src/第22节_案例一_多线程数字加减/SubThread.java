package 第22节_案例一_多线程数字加减;

public class SubThread implements Runnable{
    private Resource resource;

    public SubThread(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int x=0;x<10;x++){
            try {
                resource.sub();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
