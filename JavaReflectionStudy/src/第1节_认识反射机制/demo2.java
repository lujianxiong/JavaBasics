package 第1节_认识反射机制;
//范例：观察Class对象的使用 （通过对象找到对象的根源）
import java.util.Date;

public class demo2 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getClass());    //根据实例化对象找到对象的所属类型
    }
}
