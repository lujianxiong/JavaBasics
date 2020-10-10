package 第16节_泛型接口;
//泛型接口子类实现方式一：在子类之中继续设置泛型定义
public class Test {
    public static void main(String[] args) {
        IMessage<String> msg = new MessageImpl<>();
        System.out.println(msg.echo("Daxiong"));

        IMessage<Integer> msg2 = new MessageImpl<>();
        System.out.println(msg2.echo(99999));
    }
}
