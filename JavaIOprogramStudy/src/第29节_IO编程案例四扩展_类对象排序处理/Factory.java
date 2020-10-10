package 第29节_IO编程案例四扩展_类对象排序处理;

public class Factory {
    private Factory(){}
    public static IStudentService getInstance(){
        return new StudentServiceImpl();
    }
}
