package 第9节_定义接口标准;

public class Keyboard implements IUSB{

    @Override
    public boolean check() {
        return true;
    }

    @Override
    public void work() {
        System.out.println("键盘安装成功！开始进行码字任务");
    }
}
