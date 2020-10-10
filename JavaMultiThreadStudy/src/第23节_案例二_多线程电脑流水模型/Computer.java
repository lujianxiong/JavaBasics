package 第23节_案例二_多线程电脑流水模型;

public class Computer {
    private static int count = 0;    //生产的个数
    private String name;
    private double price;

    public Computer(String name,double price){
        this.name = name;
        this.price = price;
        count++;    //生产出一个电脑后数量+1  （即实例化一个Computer对象之后count+1）
    }

    public String toString(){
        return "【这是第"+this.count+"台电脑】电脑名字: "+this.name+"、电脑的价格:"+this.price;
    }


}
