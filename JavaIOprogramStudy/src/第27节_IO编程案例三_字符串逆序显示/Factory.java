package 第27节_IO编程案例三_字符串逆序显示;

public class Factory {
    private Factory(){}
    public static IStringService getInstance(){
        return new StringServiceImpl();
    }
}
