package 第25节_IO编程案例一_输入数字大小比较;

public class NumberServiceImpl implements INumberService{
    @Override
    public int[] stat(int count) {
        int result[] = new int[2];    //定义返回的结果
        int data[] = new int[count];    //开辟一个数组
        for (int i = 0; i < data.length; i++) {    //数字的循环输入
            data[i] =  InputUtil.getInt("请输入第“"+(i+1)+"”个数字: ");
        }
        result[0] = data[0];    //最大值
        result[1] = data[0];    //最小值
        for (int i = 0; i < data.length; i++) {
            if (data[i]>result[0]){
                result[0] = data[i];
            }
            if (data[i]<result[1]){
                result[1] = data[i];
            }
        }
        return result;
    }
}
