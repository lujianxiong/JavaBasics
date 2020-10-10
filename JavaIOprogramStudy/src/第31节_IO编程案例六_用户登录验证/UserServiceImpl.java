package 第31节_IO编程案例六_用户登录验证;

public class UserServiceImpl implements IUserService{
    private int count = 0;    //登录统计

    @Override
    public boolean isExit() {
        return this.count >=3;  //执行登录退出的条件
    }

    @Override
    public boolean login(String name, String password) {
        count++;  //每调用一次登陆验证就+1
        return "Daxiong".equals(name) && "hello".equals(password);
    }
}
