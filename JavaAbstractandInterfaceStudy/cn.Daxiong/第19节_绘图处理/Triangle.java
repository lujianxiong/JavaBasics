package 第19节_绘图处理;
//绘制三角形
public class Triangle implements IGraphical{
    //定义三条边的坐标
    private Point [] x;   //保存第一条边的坐标
    private Point [] y;   //保存第二条边的坐标
    private Point [] z;   //保存第三条边的坐标

    public Triangle(Point x[] ,Point y[],Point z[]){  //[]写x前后都可
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void paint() {
        System.out.println("绘制第一条边，开始坐标：["+this.x[0].getX()+","+this.x[0].getY()+"],结束坐标：["+this.x[1].getX()+","+this.x[1].getY()+"]");
        //先找到第一条边x，然后第一个点x[0],第一条边的一个点的横坐标getX，纵坐标getY；第一条边的第二个点的横坐标getX，纵坐标getY。
        System.out.println("绘制第二条边，开始坐标：["+this.y[0].getX()+","+this.y[0].getY()+"],结束坐标：["+this.y[1].getX()+","+this.y[1].getY()+"]");
        System.out.println("绘制第三条边，开始坐标：["+this.z[0].getX()+","+this.z[0].getY()+"],结束坐标：["+this.z[1].getX()+","+this.z[1].getY()+"]");
    }
}
