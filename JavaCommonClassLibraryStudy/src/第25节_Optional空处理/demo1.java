package 第25节_Optional空处理;

public class demo1 {
    public static void main(String[] args) {
        IMessage temp = MessageUtil.getMessage().orElse(new MessageImpl());    //当数据为空的时候了，不能直接get;得使用orElse方法。如果为空，我就实例化一个对象
        //IMessage temp = MessageUtil.getMessage().get();    //获取数据
        MessageUtil.useMessag(temp);

    }
}
