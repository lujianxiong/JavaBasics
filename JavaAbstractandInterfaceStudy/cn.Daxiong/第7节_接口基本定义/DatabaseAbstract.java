package 第7节_接口基本定义;
//范例5：子类继承抽象类并且实现接口
//定义一个抽象类
public abstract class DatabaseAbstract {
    public abstract boolean getDatabaseConnection();   //只有接口可以省略abstract，抽象类不允许省略
}
