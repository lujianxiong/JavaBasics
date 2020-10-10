package 第18节_打印流;
//范例：打印流的设计思想（模仿类库）
import java.io.IOException;
import java.io.OutputStream;

//自定义工具类，实现一些常用数据的输出
public class PrintUtil implements AutoCloseable{
    private OutputStream outputStream;  //不管你怎么输出，核心就是OutputStream
    //我们不能直接在上面实例化一个子类，因为OutputStream是一个抽象类，其子类有很多，
    //我们不可以在工具类中实例化一个子类，这样会造成耦合，我们最好的方式是定义一个构造传入参数，根据参数来实例化对应的子类

    public PrintUtil(OutputStream outputStream){  //由外部决定是文件流还是内存流等等
        this.outputStream = outputStream;
    }
    //输出字符串
    public void print(String str){
        try {
            this.outputStream.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void println(String str){
        this.print(str+"\r\n");   //这里换行得是\r\n
    }

    public void print(long num){
        this.print(String.valueOf(num));   //将long类型转为字符串类型
    }

    public void println(long num){
        this.println(String.valueOf(num));
    }

    @Override
    public void close() throws Exception {
        this.outputStream.close();
    }
}
