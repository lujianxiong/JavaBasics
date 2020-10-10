package 第13节_IO综合案例_文件拷贝;
//范例：实现文件拷贝处理   【原始处理】
//定义一个文件操作工具类
import java.io.*;

public class FileUtil {
    private File srcFile;    //源文件路径
    private File desFile;    //目标文件路径

    //这个String类型的输入会方便输入
    public FileUtil(String srcFile,String desFile){
        this(new File(srcFile),new File(desFile));   //将String类型转为File类型，然后调用本类的构造方法
    }

    public FileUtil(File srcFile,File desFile){
        this.srcFile = srcFile;
        this.desFile = desFile;
    }

    //拷贝文件
    public boolean copy() throws Exception {
        if (!this.srcFile.exists()){   //源文件必须存在
            System.out.println("拷贝的源文件不存在！");
            return false;    //拷贝失败
        }
        if (this.desFile.getParentFile().exists()){  //如果目标目录的父目录不存在，则创建目录
            this.desFile.getParentFile().mkdirs();    //创建父目录
        }
        byte data [] = new byte[1024];   //开辟一个拷贝的缓冲区
        InputStream input = null;
        OutputStream output = null;
        try{
            input = new FileInputStream(srcFile);
            output = new FileOutputStream(desFile);


            //这里是核心操作!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            //1.读取数据到数组之中，并返回读取的个数      len = input.read(data)
            //2.判断返回的个数是否是-1，若是-1则不进行写入操作      (len = input.read(data)) != -1
            int len = 0;
            while ((len = input.read(data)) != -1){
                output.write(data, 0, len);
            }

            ////do while一般在程序中很少使用
            //do {
            //    len = input.read(data);   //拷贝内容到data数组
            //    if (len != -1) {      //在这里是可能出现问题的，如果不加判断
            //        output.write(data, 0, len);    //输出读取的数据
            //    }
            //} while (len != -1);

            return true;
        }catch (Exception e){
            throw e;
        }finally {
            if (input != null){
                input.close();
            }
            if (output != null){
                output.close();
            }
        }

    }


}
//拷贝文件的时候，大文件的话，1024空间byte数组装不下，得循环几次；
//那什么时候循环结束呢，当int len = input.read(data) 中len = -1的时候，循环就可以结束了。