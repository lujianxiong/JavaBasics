package 第26节_IO编程案例二_文件保存;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileServiceImpl implements IFileService {
    private String name;
    private String content;
    public FileServiceImpl(){
        this.name = InputUtil.getString("请输入文件保存路径：");
        this.content = InputUtil.getString("请输入文件保存内容：");
    }

    @Override
    public boolean save() {
        File file = new File(IFileService.SAVE_DIR+File.separator+this.name);  //文件保存路径
        PrintWriter out = null;    //使用打印流,输出到指定文件
        try {
            out = new PrintWriter(new FileOutputStream(file));
            out.print(this.content);    //输出内容
        } catch (FileNotFoundException e) {
           return false;
        }finally {
            if (out != null){
                out.close();   //不管是否出现异常，打印流都是要关闭的
            }

        }
        return true;
    }
}
