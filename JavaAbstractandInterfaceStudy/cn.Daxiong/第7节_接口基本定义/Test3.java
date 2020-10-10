package 第7节_接口基本定义;
//范例3：观察Objrct与接口转换
public class Test3 {
    public static void main(String[] args) {
        IMessage msg = new MessageImpl();   //向上转型调用子类方法实例化一个接口对象
        Object obj = msg;         //向上转型
        IChannel chan = (IChannel) obj;    //将Object转为IChannel接口类型
        System.out.println(chan.connect());
        //为什么可以这么转？
        //两个接口类型互转和Object与接口转换看的是子类MessageImpl()，实际上一开始实例化的是子类对象
        //两个接口和Object类都与子类有关，因此可以互相转换
    }
}
