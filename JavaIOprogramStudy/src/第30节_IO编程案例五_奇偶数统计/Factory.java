package 第30节_IO编程案例五_奇偶数统计;

public class Factory {
     private Factory(){}
     public static INumberService getInstance(){
         return new NumberServiceImpl();
     }
}
