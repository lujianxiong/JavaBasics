package 第17节_RandomAccessFile;
//范例：实现文件的写入
import java.io.File;
import java.io.RandomAccessFile;

public class demo {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"hello"+File.separator+"Daxiong.txt");   //定义操作文件
        RandomAccessFile raf = new RandomAccessFile(file,"rw");    //读写模式
        String names[] = new String[]{"zhangsannihao","wangwu","lisi"};
        int ages[] = new int[]{30,20,99};
        for (int i = 0; i < names.length; i++) {
            raf.write(names[i].getBytes());    //写入字符串
            raf.writeInt(ages[i]);    //写入int数据
        }
        raf.close();

    }
}
