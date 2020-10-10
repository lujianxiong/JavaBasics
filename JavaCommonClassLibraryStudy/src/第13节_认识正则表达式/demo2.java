package 第13节_认识正则表达式;
//范例：数用正则表达式完成对数据的验证
public class demo2 {
    public static void main(String[] args) {
        String str = "123";
        if (str.matches("\\d+")){    //如果字符串中都是数字就转换，如果有其他的东西就不转换
            int num = Integer.parseInt(str);
            System.out.println(num*2);
        }
    }
}
