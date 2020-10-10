package 第17节_RandomAccessFile;
//范例：读取数据  【统一长度】  【标准读取】

import java.io.File;
import java.io.RandomAccessFile;

public class demo3 {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"hello"+File.separator+"xixi.txt");   //定义操作文件
        RandomAccessFile raf = new RandomAccessFile(file,"rw");    //读写模式

        {
            //读取“lisi”的数据
            raf.skipBytes(28);    //跳两行，14+14
            byte[] data = new byte[10];   //开辟一个空间存储姓名
            int len = raf.read(data);
            System.out.println("姓名：" + new String(data,0,len).trim()+ "、年龄：" + raf.readInt());
        }

        {
            //读取“wangwu”的数据，
            raf.seek(14);
            byte[] data = new byte[10];
            int len = raf.read(data);
            System.out.println("姓名：" + new String(data,0,len).trim()+ "、年龄：" + raf.readInt());
        }

        {
            //读取“zhansan”的数据，回跳到首字节0处
            raf.seek(0);
            byte[] data = new byte[10];
            int len = raf.read(data);
            System.out.println("姓名：" + new String(data,0,len).trim()+ "、年龄：" + raf.readInt());
        }

        raf.close();
    }
}
