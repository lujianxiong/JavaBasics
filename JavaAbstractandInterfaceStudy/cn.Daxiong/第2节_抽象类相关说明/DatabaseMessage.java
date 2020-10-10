package 第2节_抽象类相关说明;

//继承抽象类
public class DatabaseMessage extends Message {

    public DatabaseMessage(String type) {
        super(type);  //父类中提供有参构造，子类必须明确调用
    }

    @Override
    public String getConnectInfo() {
        return "Oracle数据库连接信息";
    }
}
