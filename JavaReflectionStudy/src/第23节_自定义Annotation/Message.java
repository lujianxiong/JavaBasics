package 第23节_自定义Annotation;

public class Message {
    @DefaultAnnotation(title = "Daxiong")  //给title加初始化默认值   ；  这里可以给url设置内容，如果不设置，则为默认值
    public void send(String msg){
        System.out.println("【消息发送】："+msg);
    }
}
