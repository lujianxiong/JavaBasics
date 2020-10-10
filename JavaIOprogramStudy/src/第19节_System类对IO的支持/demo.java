package 第19节_System类对IO的支持;
//范例：观察输出
public class demo {
    public static void main(String[] args) {
        try{
            Integer.parseInt("a");  //这个一定是出错的，字母不能变成Integer类型
        }catch (Exception e){
            System.out.println(e);
            System.err.println(e);
        }
    }
}
