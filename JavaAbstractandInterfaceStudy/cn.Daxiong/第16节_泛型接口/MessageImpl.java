package 第16节_泛型接口;
//泛型接口子类实现方式一：在子类之中继续设置泛型定义
//<s>是子类的含义
public class MessageImpl<S> implements IMessage<S> {
    @Override
    public String echo(S s) {
        return "【ECHO】"+s;
    }
}
