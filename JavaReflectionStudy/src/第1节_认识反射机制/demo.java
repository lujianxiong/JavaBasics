package 第1节_认识反射机制;
//范例：正向操作
import java.util.Date;  //1、导入程序所在的包，类，知道对象的出处了

public class demo {
    public static void main(String[] args) {
        Date date = new Date();    //2、通过类产生实例化对象
        System.out.println(date.getTime());    //3、根据对象调用类中的方法
    }
}
