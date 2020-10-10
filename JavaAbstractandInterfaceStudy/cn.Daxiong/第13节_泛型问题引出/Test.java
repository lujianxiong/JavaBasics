package 第13节_泛型问题引出;

import 第14节_泛型基本定义.Point;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();

        //第一步：根据需求进行内容的设置
        point.setX(10);    //进行自动装箱
        point.setY(20);    //进行自动装箱

        //第二步：从里面获取数据
        int x = (Integer) point.getX();    //向下转型
        int y = (Integer) point.getY();    //向下转型
        System.out.println("x坐标："+x+"、y坐标："+y);
    }
}

//本程序之所以可以解决当前的设计问题，主要原因在于:Object可以接受所有的数据类型，
// 但正因为如此，所以本代码也会出现有严重的安全隐患。