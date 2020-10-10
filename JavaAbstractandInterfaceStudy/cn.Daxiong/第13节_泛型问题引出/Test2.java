package 第13节_泛型问题引出;
//观察错误代码
public class Test2 {
    public static void main(String[] args) {
        Point point = new Point();

        //第一步：根据需求进行内容的设置
        point.setX(10);    //进行自动装箱
        point.setY("北纬20度");

        //第二步：从里面获取数据
        int x = (Integer) point.getX();    //向下转型
        int y = (Integer) point.getY();    //向下转型
        System.out.println("x坐标："+x+"、y坐标："+y);
    }
}
