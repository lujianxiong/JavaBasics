package 第14节_泛型基本定义;

//定义Point类并进行正确的内容操作
public class Test {
    public static void main(String[] args) {
        Point<Integer> point = new Point<Integer>();  //为point对象设置Integer泛型
        //从JDK1.7开始，泛型对象实例化可以简化为“Point<Integer> point = new Point<>();”(后面的泛型类型可以省略)
        Point<String> pointB = new Point<>();   //为pointB对象设置String泛型
        point.setX(10);
        pointB.setY("Daxiong");

        int x = point.getX();    //设置了泛型就不用向下转型了
        String y =  pointB.getY();
        System.out.println("x坐标："+x+"、y坐标："+y);
    }
}

//现在的程序代码之中，由于给point类对象设置的泛型类型为Integer，这样这个对象所有对应子泛型的属性、变量、方法返回值
//就将全部替换为Integer(只局限于此对象之中),这样在进行处理的时候如果发现设置的内容有错误，则会在程序编译的时候自动
//进行错误提示，同时也避免了对象的向下转型处理(避免安全隐患).