package 第20节_动态代理模式;
//代理类
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class XiongProxy implements InvocationHandler {
    private Object target;  //保存核心业务类对象

    /**
     * 进行核心业务对象与代理业务对象之间的绑定处理
     * @param target  核心业务对象
     * @return  Proxy生成的代理业务对象
     */
    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);  //核心业务类target的类加载器，核心业务类target的接口，InvocationHandler【本类的，直接this调用】
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*********【执行方法】："+method.getName());
        Object returnData = null;
        if (this.connect()){
            returnData = method.invoke(this.target,args);
            this.close();
        }
        return returnData;
    }

    public boolean connect(){
        System.out.println("【消息代理】：进行消息发送通道的连接");
        return true;
    }

    public void close(){
        System.out.println("【消息代理】：关闭消息通道");
    }
}
