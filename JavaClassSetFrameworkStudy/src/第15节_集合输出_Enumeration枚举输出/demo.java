package 第15节_集合输出_Enumeration枚举输出;
//Enumeration只能用于Vector集合输出
import java.util.Enumeration;
import java.util.Vector;

public class demo {
    public static void main(String[] args) {
        Vector<String> all = new Vector<>();
        all.add("Hello");
        all.add("World");
        all.add("Daxiong～");

        Enumeration<String> enu = all.elements();  //获得Enumeration接口实例化对象
        while (enu.hasMoreElements()){
            String str = enu.nextElement();
            System.out.print(str+"、");
        }

    }
}
