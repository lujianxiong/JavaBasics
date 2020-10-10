package 第1节_抽象类基本概念;
//继承抽象类
public class DatabaseMessage extends Message{

    @Override
    public String getConnectInfo() {
        return "Oracle数据库连接信息";
    }
}
