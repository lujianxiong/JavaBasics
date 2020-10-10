package 第20节_动态代理模式;

public class demo {
    public static void main(String[] args) {
        IMessage msg = (IMessage) new XiongProxy().bind(new MessageReal());
        msg.send();  //对代理对象操作的时候，会先找到InvocationHandler接口，调用invoke方法。
    }
}

//测试类中，代理对象调用方法：“代理对象.send()”，这时候会找到invoke()，通过invoke去调用业务的实现子类的send()方法