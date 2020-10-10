package 第2节_抽象类相关说明;
//定义一个抽象类
public abstract class Message {
    private String type;   //消息类型
    public Message(String type){   //父类中没有提供无参构造，子类必须明确调用
        this.type = type;
    }
    public abstract String getConnectInfo();   //抽象方法(这里没有大括号)
    public void setType(String type){    //普通方法
        this.type = type;
    }
    public String getType(){  //普通方法
        return this.type;
    }
}
