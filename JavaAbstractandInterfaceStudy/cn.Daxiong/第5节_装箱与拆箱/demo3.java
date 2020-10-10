package 第5节_装箱与拆箱;
//使用Object接受小数
public class demo3 {
    public static void main(String[] args) {
        Object obj = 19.2;  //double数据类型自动装箱为Double类对象，Double类对象自动向上转型为Object类对象；
        double num = (Double)obj;       //这时候不能直接obj++，因为只有基本数据类型和包装类对象才可以直接参与数学运算；
        //因此先将Object类对象向下转型，再自动拆箱为基本数据类型；
        System.out.println(num *2);
    }
}
