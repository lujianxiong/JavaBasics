package 第22节_案例一_多线程数字加减;

public class AddThread implements Runnable{
    private Resource resource;

    public AddThread(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int x=0;x<10;x++){
            try {
                resource.add();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
