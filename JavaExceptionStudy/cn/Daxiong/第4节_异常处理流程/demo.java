package Daxiong.第4节_异常处理流程;
//范例：简化异常处理
public class demo {
    public static void main(String[] args) {
        System.out.println("【1】******************程序开始执行******************");
        try {
            int x = Integer.parseInt(args[0]);   ///注意这两行代码要放到try里面，否则无法正确处理异常
            int y = Integer.parseInt(args[0]);
            System.out.println("【2】数据计算：(10/0) = " + (10 / 0));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("【F】不管是否出现异常，我都会执行");
        }
        System.out.println("【3】******************程序执行完毕******************");
    }
}
