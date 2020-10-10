package Daxiong.第2节_内部类相关说明.外部类产生内部类实例化对象;
//通过外部类产生内部类实例化对象
public class Outer2 {
    private String msg = "Daxiong";

    class Inner{
        public void print(){
            System.out.println(Outer2.this.msg);
        }
    }
}
