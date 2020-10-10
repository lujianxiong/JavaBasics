package Daxiong.第3节_处理多个异常;
//范例：处理多个异常
public class demo {
    public static void main(String[] args) {
        System.out.println("【1】******************程序开始执行******************");
        try {
            int x = Integer.parseInt(args[0]);   ///注意这两行代码要放到try里面，否则无法正确处理异常
            int y = Integer.parseInt(args[0]);
            System.out.println("【2】数据计算：(10/0) = " + (10 / 0));
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }finally {
            System.out.println("【F】不管是否出现异常，我都会执行");
        }
        System.out.println("【3】******************程序执行完毕******************");
    }
}

//此时程序会出现三类异常：
//1.【未处理】程序执行时没有输入初始化参数：java.lang.ArrayIndexOutOfBoundsException
//2.【未处理】输入时的数据不是数字：java.lang.NumberFormatException
//3.【已处理】输入的被除数为0：java.lang.ArithmeticException: