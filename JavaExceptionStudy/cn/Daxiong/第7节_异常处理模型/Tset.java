package Daxiong.第7节_异常处理模型;
//范例：异常处理标准格式：
public class Tset {
    public static void main(String[] args) {
        try{
            System.out.println(MyMath.div(10,0));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
