package 第7节_接口基本定义.实现接口多继承;
//范例6：实现接口多继承
//注意：extends继承接口可以继承多个，但在类继承上只能继承一个父类
public interface IService extends IMessage,IChannel{
    public String service();
}
