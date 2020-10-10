package Daxiong.第6节_throw关键字;

public class demo {
    public static void main(String[] args) {
        try {
            throw new Exception("自己抛着玩的对象。");  //该异常对象是手动定义的,不是系统生成的
        } catch (Exception e) {
            e.printStackTrace();
        }
        //这里实例化类一个Exception的对象，要么你throws Exception，要么try...catch...
        //throws和try ...catch...效果一样
    }
}
