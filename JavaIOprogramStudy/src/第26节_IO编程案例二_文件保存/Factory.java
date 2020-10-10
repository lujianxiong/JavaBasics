package 第26节_IO编程案例二_文件保存;

public class Factory {
    private Factory(){}
    public static IFileService getInstance(){
        return new FileServiceImpl();
    }
}
