package 第9节_Writer字符输出流;
//范例：使用Writer输出   【后期通过append方法追加内容】
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class demo3 {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"hello"+File.separator+"Daxiong.txt");
        if (!file.getParentFile().exists()){   //必须要判断父目录是否存在
            file.getParentFile().mkdirs();   //如果不存在就创建父目录
        }

        Writer out = new FileWriter(file);    //实例化Writer对象的时候，加个true
        String str = "爱你哟\r\n";
        out.write(str);
        out.append("我爱中国");     //追加输出内容
        out.close();

    }
}
//整个流程和OutputStream非常的相似，只是在write方法里，没有getBytes方法了。Writer字符输出流可以直接输出字符
