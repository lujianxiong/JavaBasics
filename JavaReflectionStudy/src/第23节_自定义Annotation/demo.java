package 第23节_自定义Annotation;

import java.lang.reflect.Method;

public class demo {
    public static void main(String[] args) throws Exception{
        Method method = Message.class.getMethod("send", String.class);  //获取send方法
        DefaultAnnotation da = method.getAnnotation(DefaultAnnotation.class);  //获取指定的Annotation
        //System.out.println(da.title());  //直接调用Annotation中的方法
        //System.out.println(da.url());  //直接调用Annotation中的方法
        String msg = da.title()+"("+da.url()+")"; //消息内容
        method.invoke(Message.class.getDeclaredConstructor().newInstance(),msg);  //调用send发送自定义Annotation中方法输出的消息
    }
}
