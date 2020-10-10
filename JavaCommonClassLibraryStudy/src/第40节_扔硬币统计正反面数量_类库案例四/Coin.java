package 第40节_扔硬币统计正反面数量_类库案例四;

import java.util.Random;

//模拟硬币扔的操作
public class Coin {
    private int front;   //保存正面的次数
    private int back;   //保存背面的次数
    private Random random = new Random();

    /**
     * 扔硬币的操作
     * @param num  扔硬币的执行次数
     */
    public void throwCoin(int num){
        for (int x=0;x<num;x++){
            int temp = random.nextInt(2); // （1-0+1）=2
            if (temp == 0){
                front++;
            }else{
                back++;
            }
        }
    }

    public int getFront(){
        return this.front;
    }

    public int getBack(){
        return this.back;
    }
}
