package Daxiong.第6节_Lambda表达式.Lambda表达式的使用;
//使用函数式注解
@FunctionalInterface  //函数式接口
public interface IMessage {
    public void send(String str);
}
