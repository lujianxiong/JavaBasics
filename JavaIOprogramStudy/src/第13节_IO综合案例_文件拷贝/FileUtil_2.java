package 第13节_IO综合案例_文件拷贝;
//范例：实现对文件夹的完整拷贝
//定义一个文件操作工具类
import java.io.*;

public class FileUtil_2 {
    private File srcFile;    //源文件路径
    private File desFile;    //目标文件路径

    //这个String类型的输入会方便输入
    public FileUtil_2(String srcFile, String desFile) {
        this(new File(srcFile), new File(desFile));   //将String类型转为File类型，然后调用本类的构造方法
    }

    public FileUtil_2(File srcFile, File desFile) {
        this.srcFile = srcFile;
        this.desFile = desFile;
    }


    //拷贝文件
    public boolean copy() throws Exception {
        if (!this.srcFile.exists()) {   //源文件必须存在
            System.out.println("拷贝的源文件不存在！");
            return false;    //拷贝失败
        }

        return this.copyFileImpl(this.srcFile, this.desFile);   //调用拷贝文件的具体实现方法

    }

    //拷贝文件的具体实现
    private boolean copyFileImpl(File srcFile, File desFile) throws Exception {
        //判断放在这里
        if (!desFile.getParentFile().exists()) {  //如果目标目录的父目录不存在，则创建目录
            desFile.getParentFile().mkdirs();    //创建父目录
        }
        byte data[] = new byte[1024];    //开辟一个拷贝的缓冲区
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(srcFile);
            output = new FileOutputStream(desFile);
            int len = 0;
            while ((len = input.read(data)) != -1) {
                output.write(data, 0, len);
            }
            return true;
        } catch (Exception e) {
            throw e;
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }

    //拷贝目录
    public boolean copyDir() throws Exception {
        //事实上来讲这个意义不大，使用try简单处理一下异常
        try {
            this.copyDirImpl(this.srcFile);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    //拷贝目录具体实现
    private void copyDirImpl(File file) throws Exception {
        if (file.isDirectory()){    //如果是目录
            File[] results = file.listFiles();    //列出全部目录组成
            if (results != null){
                for (int x=0;x<results.length;x++){
                    copyDirImpl(results[x]);   //调用此方法，递归操作
                }
            }
        }else{    //不是目录，是文件
            String newFilePath = file.getPath().replace(this.srcFile.getPath()+File.separator,"");
            //src.getPath 是 E:\hello\各学院学生会通讯录信息 【传进来的目录的路径】
            //file.getPath 是前面的if判断中对目录递归调用，每个目录中的文件传为file，因此是文件file的完整路径
            //所以replace方法是将文件完整路径中的原路径替换掉；

            File newFile = new File(this.desFile,newFilePath);
            //拷贝的目标路径 【新的文件的绝对路径 = 目标路径+每个子目录在源目录下的相对路径】
            //这里实际上是使用了这个File类的构造方法：public File​(String parent,String child)

            copyFileImpl(file,newFile);  //将文件从源路径拷贝到新路径下

        }
    }

}