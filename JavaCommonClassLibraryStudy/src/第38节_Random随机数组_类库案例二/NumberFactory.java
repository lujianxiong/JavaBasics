package 第38节_Random随机数组_类库案例二;
//生成1-30之间的随机数
import java.util.Random;

public class NumberFactory {
    private static Random random = new Random();
    /**
     * 通过随机数来生成一个数组的内容，该内容不包括0  【可重复】
     * @param len  要开辟的数组大小
     * @return  随机数的内容
     */
    public static int [] creat(int len){
        int data[] = new int[len];   //开辟新的数组
        int foot = 0;
        while (foot<data.length){
            int num = random.nextInt(31); //（30-0+1） = 31
            if (num != 0){
                data[foot++] = num;   //如果不等于0，保存数据，并且foot +1
            }
        }
        return data;
    }
}
