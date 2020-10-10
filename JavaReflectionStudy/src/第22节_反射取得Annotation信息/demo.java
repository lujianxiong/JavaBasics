package 第22节_反射取得Annotation信息;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class demo {
    public static void main(String[] args) throws Exception{
        {  //获取IMessage接口上的Annotation信息
            Annotation[] annotations = IMessage.class.getAnnotations();    //获取接口上全部的Annotation
            for (Annotation temp : annotations){
                System.out.println(temp);
            }
        }

        System.out.println("---------------------------------------------------------");
        {  //获取MessageImpl子类上的Annotation
            Annotation[] annotations = MessageImpl.class.getAnnotations();
            for (Annotation temp : annotations){
                System.out.println(temp);
            }
        }

        System.out.println("---------------------------------------------------------");
        {  //获取MessageImpl.send()方法上的Annotation
            Method methods = MessageImpl.class.getDeclaredMethod("send",String.class);  //找到send方法
            Annotation[] annotations = methods.getAnnotations();    //获取send方法上的Annotation
            for (Annotation temp : annotations){
                System.out.println(temp);
            }
        }
    }
}
