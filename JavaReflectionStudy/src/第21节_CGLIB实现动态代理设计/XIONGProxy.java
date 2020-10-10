package 第21节_CGLIB实现动态代理设计;
//拦截器配置
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class XIONGProxy implements MethodInterceptor {
    private Object target;  // 保存真实业务对象

    public XIONGProxy(Object target){
        this.target = target;  //构造方法接收、保存真实业务对象
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
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
