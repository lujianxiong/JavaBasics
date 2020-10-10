package Daxiong.第9节_自定义异常类;

public class Food {
    public static void eat(int num)throws BombException{   //throws 自定义异常类（吃这个方法有可能抛出爆炸的异常）
        if(num>10){
            throw new BombException("吃太多了，肚子爆了");
        }else{
            System.out.println("我还可以，快到碗里来！");
        }
    }
}
