package 第9节_Writer字符输出流;
//范例：使用Writer输出    【实例化Writer对象时通过true追加内容】
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class demo2 {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"hello"+File.separator+"Daxiong.txt");
        if (!file.getParentFile().exists()){   //必须要判断父目录是否存在
            file.getParentFile().mkdirs();   //如果不存在就创建父目录
        }

        Writer out = new FileWriter(file,true);    //实例化Writer对象的时候，加个true
        String str = "爱你哟";
        out.write(str);
        out.close();

    }
}
//整个流程和OutputStream非常的相似，只是在write方法里，没有getBytes方法了。Writer字符输出流可以直接输出字符
