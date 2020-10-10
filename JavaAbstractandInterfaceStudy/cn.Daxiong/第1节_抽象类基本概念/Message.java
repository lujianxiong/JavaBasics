package 第1节_抽象类基本概念;
//定义一个抽象类
public abstract class Message {
    private String type;   //消息类型
    public abstract String getConnectInfo();   //抽象方法(这里没有大括号)
    public void setType(String type){    //普通方法
        this.type = type;
    }
    public String getType(){  //普通方法
        return this.type;
    }
}
