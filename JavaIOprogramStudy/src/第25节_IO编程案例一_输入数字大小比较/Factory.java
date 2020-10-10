package 第25节_IO编程案例一_输入数字大小比较;

public class Factory {
    private Factory(){};
    public static INumberService getInstance(){
        return new NumberServiceImpl();
    }
}
