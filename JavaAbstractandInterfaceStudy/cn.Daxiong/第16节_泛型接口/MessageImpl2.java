package 第16节_泛型接口;
//泛型接口子类实现方式二：在子类实现父接口的时候直接定义出具体泛型类型
public class MessageImpl2 implements IMessage<String> {
    @Override
    public String echo(String s) {
        return "【ECHO】"+s;
    }
}
