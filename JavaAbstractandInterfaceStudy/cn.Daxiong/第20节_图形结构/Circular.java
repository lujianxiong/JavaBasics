package 第20节_图形结构;

public class Circular extends AbstractShape{
    private double radius;

    public Circular(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.1415926*this.radius*this.radius;   //圆形的面积：半径^2 × 3.14
    }

    @Override
    public double perimeter() {
        return 2*3.1415926*this.radius;    //圆形的周长：半径×2×3.14
    }
}
