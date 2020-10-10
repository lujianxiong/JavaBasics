package Daxiong.第19节_综合案例_宠物商店;

public class PetShop {    //宠物商店
    private ILink<Pet> Pets = new LinkImpl<>();    //实例化一个链表存储Pet对象

    //宠物上架
    public void add(Pet pet){    //追加宠物，商品上架
        this.Pets.add(pet);    //调用链表中的add方法保存Pet对象
    }

    //宠物下架
    public void delete(Pet pet){
        this.Pets.remove(pet);
    }

    //宠物信息查询
    public ILink<Pet> search(String keyword){
        ILink<Pet> searchResult = new LinkImpl<>();    //实例化一个对象保存查询的数据
        Object result[] = this.Pets.toArray();    //获取全部数据
        if(result != null) {
            for (Object obj : result) {
                Pet pet = (Pet)obj;
                if(pet.getName().contains(keyword) || pet.getColor().contains(keyword)){
                    searchResult.add(pet);    //保存查询结果
                }
            }
        }
        return searchResult;
    }
}
