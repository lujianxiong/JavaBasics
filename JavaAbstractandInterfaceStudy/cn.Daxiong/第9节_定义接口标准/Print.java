package 第9节_定义接口标准;

public class Print implements IUSB{

    @Override
    public boolean check() {
        return false;
    }

    @Override
    public void work() {
        System.out.println("打印机安装成功！开始进行照片打印");
    }
}
