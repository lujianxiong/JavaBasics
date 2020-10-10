package Daxiong.第20节_综合案例_超市购物车;
//定义购物车标准
public interface IShopCar {
    public void add(IGoods goods);    //添加商品
    public void delete(IGoods goods);    //删除商品
    public Object[] getALL();    //获得购物车中的全部商品
}
