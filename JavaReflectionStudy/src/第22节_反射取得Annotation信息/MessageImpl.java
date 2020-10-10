package 第22节_反射取得Annotation信息;

import java.io.Serializable;

@SuppressWarnings("serial")   //压制警告Annotation 【无法在程序执行的时候获取】
public class MessageImpl implements IMessage, Serializable {
    @Override   //覆写方法声明  【无法在程序执行的时候获取】
    public void send(String msg) {
        System.out.println("【消息发送】："+msg);
    }
}
