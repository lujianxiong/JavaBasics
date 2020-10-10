package 第6节_数据类型转换;
//通过包装类的转换方法实现String与int类型的转换
public class demo1 {
    public static void main(String[] args) {
        String str = "1a23";  //字符串由数字组成
        int num = Integer.parseInt(str);  //parseInt方法将字符串类型的数据专为int；
        //parse英语翻译：解析
        System.out.println(num * num);
    }
}

//在转换的过程之中千万要记住，此时的字符串必须全部由数字所组成！