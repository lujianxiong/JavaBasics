package 第31节_IO编程案例六_用户登录验证;

public interface IUserService {
    public boolean isExit();  //判断程序是否需要退出
    public boolean login(String name,String password);  //登录控制

}
