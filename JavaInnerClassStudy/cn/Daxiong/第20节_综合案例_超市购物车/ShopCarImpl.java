package Daxiong.第20节_综合案例_超市购物车;
//定义购物车具体实现类
public class ShopCarImpl implements IShopCar{
    private ILink<IGoods> allGoods = new LinkImpl<>();     //实例化一个链表实现商品的存取

    @Override
    public void add(IGoods goods) {
        this.allGoods.add(goods);
    }

    @Override
    public void delete(IGoods goods) {
        this.allGoods.remove(goods);
    }

    @Override
    public Object[] getALL() {
        return this.allGoods.toArray();
    }
}
