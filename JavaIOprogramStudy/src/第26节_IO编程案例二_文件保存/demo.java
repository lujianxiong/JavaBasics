package 第26节_IO编程案例二_文件保存;

import java.io.File;

public class demo {
    //静态代码块优先于主方法执行
    static {   //项目启动的时候就创建文件保存目录
        File file = new File(IFileService.SAVE_DIR);  //目录有可能不存在
        if (!file.exists()){   //如果文件目录不存在，则创建目录
            file.mkdirs();   //创建目录
        }
    }

    public static void main(String[] args) {
        IFileService fs = Factory.getInstance();
        System.out.println(fs.save());
    }
}
