package 第19节_绘图处理;

public class Test {
    public static void main(String[] args) {         //第一条边(1,1)-(3,3)  第二条边(3,3)-(5,1)  第三条边(5,1)-(1,1)
        IGraphical iga = Factory.getInstance("triangle",1,1,3,3,3,3,5,1,5,1,1,1);
        iga.paint();

        IGraphical iga2 = Factory.getInstance("circular",10);
        iga2.paint();
    }
}
