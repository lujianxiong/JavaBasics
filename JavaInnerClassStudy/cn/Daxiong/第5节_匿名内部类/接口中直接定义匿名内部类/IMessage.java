package Daxiong.第5节_匿名内部类.接口中直接定义匿名内部类;

public interface IMessage {
    public void send(String str); //定义一个抽象方法

    public static IMessage getInstance(){  //定义一个static方法
        return new IMessage() {   //直接在这里利用匿名内部类进行处理
            @Override
            public void send(String str) {
                System.out.println(str);
            }
        };
    }
}
