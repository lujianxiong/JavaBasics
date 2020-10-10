package 第17节_RandomAccessFile;
//范例：实现文件的写入  【统一长度】 【标准写入】
import java.io.File;
import java.io.RandomAccessFile;

public class demo3_ {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"hello"+File.separator+"xixi.txt");   //定义操作文件
        RandomAccessFile raf = new RandomAccessFile(file,"rw");    //读写模式
        String names[] = new String[]{"zhangsan  ","wangwu    ","lisi      "};
        int ages[] = new int[]{30,20,99};
        for (int i = 0; i < names.length; i++) {
            raf.write(names[i].getBytes());    //写入字符串
            raf.writeInt(ages[i]);    //写入int数据
        }
        raf.close();

    }
}
