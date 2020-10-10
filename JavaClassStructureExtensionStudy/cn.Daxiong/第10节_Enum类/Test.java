package 第10节_Enum类;

public class Test {
    public static void main(String[] args) {
        for(Color c:Color.values()){
            System.out.println(c.ordinal()+"-"+c.name());
            //Enum类中定义的oridinal和name方法可以调用，说明c是Enum类的对象
        }
    }
}
