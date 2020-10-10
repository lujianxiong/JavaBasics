package 第4节_包装类简介与原理分析;
//以int数据为例实现一个包装处理的定义
public class Int {
    private int data;  //包装了一个基本数据类型
    public Int(int data){
        this.data = data;
    }
    public int intValue(){
        return this.data;
    }
}
