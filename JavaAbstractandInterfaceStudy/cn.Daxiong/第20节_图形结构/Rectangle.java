package 第20节_图形结构;

public class Rectangle extends AbstractShape{
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return this.length*this.width;
    }

    @Override
    public double perimeter() {
        return 2*(this.length+this.width);
    }
}
