package 第31节_IO编程案例六_用户登录验证;

public class Factory {
    private Factory() {}

    public static IUserService getInstance() {
        return new UserServiceProxy(new UserServiceImpl());   //实例化一个代理类，接受实例化的一个接口子类对象
    }
}
