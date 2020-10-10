package 第17_18节_ClassLoader类加载器简介;
//自定义类加载器（下面有个方法JDK1.9之后才可以用）
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class DaxiongClassLoader extends ClassLoader {
    private static final String MESSAGR_CLASS_PATH = "E:\\IDEA 2019\\Reflection\\out\\production\\Reflection\\第17_18节_ClassLoader类加载器简介\\Message.class" + File.separator;  //因为这个路径是在太长太繁琐，就不用File.se

    /**
     * 进行指定类加载，
     *
     * @param className 类的完整名称“包.类名称”
     * @return 返回一个指定类的Class对象
     * @throws Exception //如果类文件不存在，则无法加载
     */
    public Class<?> loadData(String className) throws Exception {
        byte [] data = this.loadClassData();  //调用下面的loadClassData方法读取二进制数据文件
        if (data != null){  //读取到了
            super.defineClass(className,data,0,data.length);
        }
        return null;
    }

    //通过文件进行类的加载
    private byte[] loadClassData() throws Exception {
        InputStream input = null;
        ByteArrayOutputStream bos = null;  //将数据加载到内存之中
        byte data[] = null;
        try {
            input = new FileInputStream(new File(MESSAGR_CLASS_PATH));  // 文件流加载
            //input.transferTo(bos);  //这个方法是1.9之后提供大的     【所以这个方法现在执行是有问题的..............................】
            data =  bos.toByteArray();
        } catch (Exception e) {

        } finally {
            if (input != null) {
                input.close();
            }
            if (bos != null) {
                bos.close();
            }
        }
        return data;
    }
}
