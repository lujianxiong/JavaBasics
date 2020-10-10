package 第17节_RandomAccessFile;
//范例：读取数据

import java.io.File;
import java.io.RandomAccessFile;

public class demo2 {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"hello"+File.separator+"Daxiong.txt");   //定义操作文件
        RandomAccessFile raf = new RandomAccessFile(file,"rw");    //读写模式
        {
            //读取“lisi”的数据，跳过   个字节,跳过的位数要精确计算，字符串和数字的字节数
            raf.skipBytes(27);    //跳两行，根据保存数据计算字节数： 13+4+6+4=27
            byte[] data = new byte[4];   //开辟一个空间存储姓名
            //注意：要读取的姓名是占几个字节就开辟多大，否则会影响后面的数字读取
            int len = raf.read(data);
            System.out.println("姓名：" + new String(data,0,len)+ "、年龄：" + raf.readInt());
        }

        {
            //读取“wangwu”的数据，回跳到 17 字节处  （从开始处算：13+4=17）
            raf.seek(17);
            byte[] data = new byte[6];
            int len = raf.read(data);
            System.out.println("姓名：" + new String(data,0,len)+ "、年龄：" + raf.readInt());
        }

        {
            //读取“zhansan”的数据，回跳到首字节0处
            raf.seek(0);
            byte[] data = new byte[13];
            int len = raf.read(data);
            System.out.println("姓名：" + new String(data,0,len)+ "、年龄：" + raf.readInt());
        }

        raf.close();
    }
}
