package Daxiong.第20节_综合案例_超市购物车;
//定义收银台
public class Cashier {
    private IShopCar shopCar;    //收银台是与购物车相关的

    public Cashier(IShopCar shopCar){
        this.shopCar = shopCar;
    }

    public double allPrice(){    //计算总价
        double all = 0.0;    //定义一个总价
        Object result[] = this.shopCar.getALL();  //得到全部商品的一个数组
        for(Object obj:result){
            IGoods goods = (IGoods)obj;    //从数组里依次把每个商品给取出来
            all += goods.getPrice();    //计算总价
        }
        return all;
    }

    public int allCount(){    //计算数量
        return this.shopCar.getALL().length;    //getAll返回的商品的数组，获得数组长度即商品的个数
    }
}
