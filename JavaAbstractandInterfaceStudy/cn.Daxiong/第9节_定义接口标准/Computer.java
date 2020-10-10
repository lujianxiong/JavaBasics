package 第9节_定义接口标准;

public class Computer{
    public void plugin(IUSB usb){    //plugin 英文翻译：插件
        if(usb.check()){
            usb.work();   //检查通过就开始工作
        }else{
            System.out.println("硬件设备安装出错，无法使用");
        }
    }
}
