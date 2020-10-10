package 第7节_接口基本定义;
//定义一个接口（标准定义）
//为了区分接口，接口名称前面一般都要加"I" (Interface的简写)
public interface IMessage {
    public static final String INFO = "xiong.blog.csdn.net";   //定义一个全局静态常量
    public abstract String getInfo();    //定义一个抽象方法
}
