package 第22节_反射取得Annotation信息;
//加两个Annotation
@FunctionalInterface    //函数式接口：只能有一个方法
@Deprecated         //过期声明
public interface IMessage {
    public void send(String msg);
}
