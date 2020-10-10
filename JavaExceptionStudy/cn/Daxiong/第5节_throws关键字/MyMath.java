package Daxiong.第5节_throws关键字;

//方法定义的时候加throws Exception 意思是：这个代码执行的时候可能会产生算数异常,如果产生异常类，调用处 处理

public class MyMath {
    public static int div(int x,int y)throws ArithmeticException{
        //可以throws具体的异常类，也可以throws Exception,这两者有些许区别，对调用方法方法处一个强制处理异常(即try...catch...finally)，一个不强制
        return x/y;
    }
}
