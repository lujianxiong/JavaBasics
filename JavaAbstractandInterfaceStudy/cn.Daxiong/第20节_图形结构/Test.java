package 第20节_图形结构;

public class Test {
    public static void main(String[] args) {
        AbstractShape a = Factory.getInstance("Circular",1.1);
        AbstractShape b = Factory.getInstance("Rectangle",1,2,1,3);
        System.out.println(" 圆形的面积："+a.area()+"、圆形的周长"+a.perimeter());
        System.out.println("矩形的面积"+b.area()+"、矩形的周长"+b.perimeter());
    }
}
