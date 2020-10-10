package Daxiong.第9节_自定义异常类;

public class BombException extends RuntimeException{
    public BombException(String msg){
        super(msg);    //Exception有一个有参构造
    }
}
