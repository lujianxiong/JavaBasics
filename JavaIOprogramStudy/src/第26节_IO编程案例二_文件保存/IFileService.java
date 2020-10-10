package 第26节_IO编程案例二_文件保存;

import java.io.File;

public interface IFileService {
    //将全局常量放在接口中会很方便
    public static final String SAVE_DIR = "e:"+ File.separator+"hello"+File.separator;

    /**
     * 定义文件的保存处理方法
     * @return    保存成功返回true，否则返回false
     */
    public boolean save();
}
