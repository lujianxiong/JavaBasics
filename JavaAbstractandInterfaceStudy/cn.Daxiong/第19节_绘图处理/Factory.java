package 第19节_绘图处理;

public class Factory {
    public static IGraphical getInstance(String classname,int ... args){ //通过方法可变参数传递操作的内容
        if("triangle".equalsIgnoreCase(classname)){  //忽略大小写进行字符串内容比较
            return new Triangle(
                    new Point[]{  //第一条边x的两个顶点坐标
                        new Point(args[0],args[1]), new Point(args[2],args[3])},

                    new Point[]{
                            new Point(args[4],args[5]), new Point(args[6],args[7])},

                    new Point[]{
                            new Point(args[8],args[9]), new Point(args[10],args[11])}
                        );   //封装成对象数组的形式
        }else if("circular".equalsIgnoreCase(classname)){
            return new Circular(args[0]);
        }else{
            return null;
        }
    }
}
