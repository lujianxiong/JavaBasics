package 第28节_IO编程案例四_类对象排序处理;

public class Factory {
    private Factory(){}
    public static IStudentService getInstance(){
        return new StudentServiceImpl(InputUtil.getString("请输入数据信息："));
    }
}
