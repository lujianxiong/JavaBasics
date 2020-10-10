package 第7节_接口基本定义.实现接口多继承;

public class MessageService implements IService{
    //MessageService实现IService接口，但IService接口继承了两个接口，因此要覆写三个接口的所有方法

    @Override
    public String service() {
        return "获取消息服务";
    }

    @Override
    public boolean connect() {
        return true;
    }

    @Override
    public String getInfo() {
        return null;
    }
}
