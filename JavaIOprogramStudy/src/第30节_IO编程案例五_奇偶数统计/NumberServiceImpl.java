package 第30节_IO编程案例五_奇偶数统计;

public class NumberServiceImpl implements INumberService{

    @Override
    public int[] stat() {
        int stat[] = new int[]{0,0};    //第一个表述偶数的个数，第二个表述奇数的个数
        String str = InputUtil.getString("请输入一串数字信息：");
        String result[] = str.split("");    //按照每个字符拆分  【正则里什么都不写就表示按照每个字符拆分】
        for (int i = 0; i < result.length; i++) {
            if (Integer.parseInt(result[i]) %2 == 0){
                stat[0]++;
            }else {
                stat[1]++;
            }
        }
        return stat;
    }
}
