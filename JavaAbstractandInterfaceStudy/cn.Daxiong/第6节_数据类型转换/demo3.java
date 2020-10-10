package 第6节_数据类型转换;
//基本数据类型转换为字符串
public class demo3 {
    public static void main(String[] args) {
        int num = 100;
        String str = num+"";   //方法一：字符串连接（这种做法会产生无用的垃圾）
        System.out.println(str);   //如果此时可以调用上面的方法说明程序是正常的

        String str2 = String.valueOf(num);  //方法一：调用String类中的valueOf方法将字符串转换
        System.out.println(str2);

    }
}

