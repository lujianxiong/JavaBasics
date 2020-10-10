package Daxiong.第20节_综合案例_超市购物车;

public class Test {
    public static void main(String[] args) {
        IShopCar car = new ShopCarImpl();   //推一个购物车
        car.add(new Book("Java开发",79.9));    //往购物车里装商品
        car.add(new Book("Oracle开发",109.9));
        car.add(new Bag("NIKE双肩包",999.9));

        Cashier cas = new Cashier(car);     //将购物车推到收银台
        System.out.println("【发票】：总价格:"+cas.allPrice()+"、总数量:"+cas.allCount());
    }
}
