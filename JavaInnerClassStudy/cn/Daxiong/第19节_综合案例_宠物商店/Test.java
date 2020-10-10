package Daxiong.第19节_综合案例_宠物商店;

public class Test {
    public static void main(String[] args) {
        PetShop shop = new PetShop();   //开店
        shop.add(new Dog("大黄眼","黄色"));
        shop.add(new Dog("斗牛犬","棕色"));
        shop.add(new Dog("藏獒","黄色"));
        shop.add(new Cat("小花猫","黄色"));
        shop.add(new Cat("小白猫","白色"));

        System.out.println("输出名字或颜色中含有关键词“黄”的宠物全部信息:");
        Object result[] = shop.search("黄").toArray();
        for(Object obj : result){
            System.out.println(obj);
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println("输出名字或颜色中含有关键词“猫”的宠物全部信息:");
        Object result2[] = shop.search("猫").toArray();
        for(Object obj : result2){
            System.out.println(obj);
        }


    }
}
