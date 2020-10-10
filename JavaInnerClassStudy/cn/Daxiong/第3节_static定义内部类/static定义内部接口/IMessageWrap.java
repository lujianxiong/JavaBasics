package Daxiong.第3节_static定义内部类.static定义内部接口;
//这种结构很常见！！！！
public interface IMessageWrap {  //消息包装接口

    public static void send(IMessage msg,IChannel channel){     //static定义的send方法
        if(channel.connect()){
            System.out.println(msg.getContent());
        }else{
            System.out.println("消息通道无法建立，消息发送失败");
        }
    }

    static interface IMessage{   //static定义内部接口：消息内容
        public String getContent();
    }

    static interface IChannel{   //static定义的内部接口：消息通道
        public boolean connect();
    }

    class DefaultMessage implements IMessageWrap.IMessage{  //IMessage的具体实现内部类：DefaultMessage
        public String getContent(){
            return "Daxiong";
        }
    }

    class NetMessage implements IMessageWrap.IChannel{   //IChannel的具体实现内部类：NetMessage

        @Override
        public boolean connect() {
            return true;
        }
    }
}
