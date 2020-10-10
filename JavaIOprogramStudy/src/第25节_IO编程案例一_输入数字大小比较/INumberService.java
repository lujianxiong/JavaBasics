package 第25节_IO编程案例一_输入数字大小比较;
//定义一个输入的标准
public interface INumberService {
    /**
     * 输入数据并且返回输入数据的最大值与最小值
     * @param count   输入的数据个数
     * @return    包含有两个内容：第一个为最大值，第二个为最小值
     */
    public int[] stat(int count);
}
