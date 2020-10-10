package 第19节_绘图处理;
//定义一个圆形
public class Circular implements IGraphical{
    private int radius;
    public Circular(int radius){
        this.radius = radius;
    }

    @Override
    public void paint() {
        System.out.println("以半径为"+this.radius+"进行绘制圆形");
    }
}
