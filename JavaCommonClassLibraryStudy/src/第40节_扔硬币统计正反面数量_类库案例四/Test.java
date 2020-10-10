package 第40节_扔硬币统计正反面数量_类库案例四;

public class Test {
    public static void main(String[] args) {
        Coin coin = new Coin();
        coin.throwCoin(1000);
        System.out.println("正面出现次数："+coin.getFront());
        System.out.println("背面出现次数："+coin.getBack());
    }
}
