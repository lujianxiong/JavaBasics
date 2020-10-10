package 第9节_定义枚举类型;

public class Test {
    public static void main(String[] args) {
        Color c = Color.红色;  //获取实例化对象
        System.out.println(c);

        //利用values()方法获取所有的枚举对象进行输出
        for(Color a:Color.values()){
            System.out.println(a);
        }
    }
}
