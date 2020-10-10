package 第31节_IO编程案例六_用户登录验证;

public class UserServiceProxy implements IUserService {
    private IUserService userService;

    public UserServiceProxy(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean isExit() {
        return this.userService.isExit();
    }

    @Override
    public boolean login(String name, String password) {
        while (!this.isExit()) {  //当不满足退出条件时，循环
            String inputData = InputUtil.getString("请输入登录信息:");
            if (inputData.contains("/")) {  //如果有"/",表示输入了用户名和密码,可以进行拆分
                String temp[] = inputData.split("/");  //数据拆分
                if (this.userService.login(temp[0], temp[1])) {   //登录认证成功
                    return true;    //整个函数返回true，循环结束
                } else {
                    System.out.println("登录失败，错误的用户名和密码！");
                }
            } else {  //没有“/”，说明只输入了用户名
                String pwd = InputUtil.getString("请输入密码：");
                if (this.userService.login(inputData, pwd)) {   //登录认证成功
                    return true;    //整个函数返回true，循环结束
                } else {
                    System.out.println("登录失败，错误的用户名和密码！");
                }
            }
        }
        return false;   //退出循环，登录失败
    }
}