package 第7节_接口基本定义;
//实例2：继承都个接口实现多继承
public class Test2 {
    public static void main(String[] args) {
        IMessage msg = new MessageImpl();   //向上转型调用子类方法实例化一个接口对象
        IChannel chl = (IChannel) msg;
        System.out.println(chl.connect());
        //IMessage和IChannel是没有任何的关系，是独立的接口，但是可以进行接口转换
        //为什么可以转？接口名只是一个标记，真正new的是MessageImpl，而MessageImpl是IChannel的子类

    }
}
