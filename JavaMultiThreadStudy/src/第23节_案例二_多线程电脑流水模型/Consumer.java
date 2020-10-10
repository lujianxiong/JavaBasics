package 第23节_案例二_多线程电脑流水模型;

public class Consumer implements Runnable{
    private Resource resource;

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int x=0;x<10;x++){
            try {
                resource.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
