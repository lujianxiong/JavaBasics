package 第7节_接口基本定义;
//范例5：子类继承抽象类并且实现接口
//子类先继承再实现接口
public class MessageImpl_2 extends DatabaseAbstract implements IMessage,IChannel{

    @Override
    public boolean getDatabaseConnection() {
        return true;
    }

    @Override
    public boolean connect() {
        System.out.println("【消息发送通道已连接完毕】");
        return true;
    }

    @Override
    public String getInfo() {
        if(connect()){
            if(this.getDatabaseConnection()) {
                return "【数据库】中有一个秘密消息:今天我的博客访问量破万了！";
            }else{
                return "【数据库消息无法访问】";
            }
        }
        return "【通道创建失败，无法获取消息】";
    }
}
