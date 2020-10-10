package 第16节_泛型接口;
//泛型接口子类实现方式二：在子类实现父接口的时候直接定义出具体泛型类型
public class Test2 {
    public static void main(String[] args) {
        IMessage<String> msg = new MessageImpl2();  //父接口正常制定类型，“=”后面的可以省略
        System.out.println(msg.echo("Daxiong"));

    }
}
