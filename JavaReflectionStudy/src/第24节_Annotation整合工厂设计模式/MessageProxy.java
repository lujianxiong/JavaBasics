package 第24节_Annotation整合工厂设计模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MessageProxy implements InvocationHandler {
    private Object target;

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (connect()){
                return method.invoke(target, args);
            }else{
                throw new Exception("【ERROR】消息无法进行发送");
            }
        }finally {
            close();
        }


    }

    public boolean connect() {
        System.out.println("【代理操作】：进行消息发送通道的连接 ...");
        return true;
    }

    public void close(){
        System.out.println("【代理操作】：关闭连接通道");
    }
}
