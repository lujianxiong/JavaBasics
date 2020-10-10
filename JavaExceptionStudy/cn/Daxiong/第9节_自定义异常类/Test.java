package Daxiong.第9节_自定义异常类;

public class Test {
    public static void main(String[] args) {
        //由于咱们自定义的类继承的是Exception类，所以必须要处理异常(可以抛给JVM默认处理或者使用try...catch...)
        //如果把咱们自定义的类继承RuntimeExceptin，我们就不需要管处不处理了
            Food.eat(11);
    }
}
