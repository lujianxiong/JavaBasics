package 第9节_定义接口标准;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.plugin(new Keyboard());   //插入键盘
        computer.plugin(new Print());    //插入打印机
    }
}
