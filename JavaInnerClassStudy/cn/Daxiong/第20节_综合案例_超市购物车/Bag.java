package Daxiong.第20节_综合案例_超市购物车;

public class Bag implements IGoods{
    private String name;
    private double price;

    public Bag(String name,double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "【书包信息】名称:"+this.name+"、价格:"+this.price;
    }

    @Override
    public boolean equals(Object obj) {      //必须覆写equals，否则商品不能删
        if(obj == null){
            return false;
        }
        if(this ==obj){
            return true;
        }
        if(!(obj instanceof Bag)){
            return false;
        }
        Bag bag = (Bag)obj;
        return this.name.equals(bag.name) || this.price == bag.price;    //对name和price分别调用equals方法
    }
}
