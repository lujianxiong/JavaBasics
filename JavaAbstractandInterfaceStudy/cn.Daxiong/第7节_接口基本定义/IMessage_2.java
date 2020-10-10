package 第7节_接口基本定义;
//范例4：接口的简化定义
public interface IMessage_2 {
    String INFO = "xiong.blog.csdn.net";
    String getInfo();
    //注意：方法不写访问权限也是public，不是default，所以覆写的时候只可以使用public定义
    //考虑标准化的时候可以写全，考虑简单化的时候可以简写
}
