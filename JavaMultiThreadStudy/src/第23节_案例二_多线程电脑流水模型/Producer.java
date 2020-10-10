package 第23节_案例二_多线程电脑流水模型;

public class Producer implements Runnable{
    private Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int x=0;x<10;x++){
            try {
                resource.make();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
