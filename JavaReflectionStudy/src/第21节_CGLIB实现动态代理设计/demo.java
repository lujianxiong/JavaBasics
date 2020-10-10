package 第21节_CGLIB实现动态代理设计;

import net.sf.cglib.proxy.Enhancer;

public class demo {
    public static void main(String[] args) {
        Message realObject = new Message();  //实例化真实业务类对象
        Enhancer enhancer = new Enhancer();  //负责代理的程序类
        enhancer.setSuperclass(realObject.getClass());  //  假定一个父类
        enhancer.setCallback(new XIONGProxy(realObject));  //设置代理类
        Message proxyObject = (Message) enhancer.create();  //创建代理对象
        proxyObject.send();

    }
}
