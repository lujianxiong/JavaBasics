package Daxiong.第2节_内部类相关说明.外部类访问内部类私有属性;
// 外部类访问内部类中私有属性
public class Outer {
    private String msg = "Daxiong";
    public void fun(){
       Inner inner = new Inner();
        inner.print();
        System.out.println(inner.info);   //访问内部类的私有属性
    }

    class Inner{
        private String info = "今天去上海迪士尼玩儿";
        public void print(){
            System.out.println(Outer.this.msg);
        }
    }
}
//   外部类.内部类 内部类对象 = new 外部类().内部类()；
// 如果还有孙子类，就是内部类中还有内部类，一直往下.