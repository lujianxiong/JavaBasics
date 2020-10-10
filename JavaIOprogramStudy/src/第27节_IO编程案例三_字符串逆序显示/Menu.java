package 第27节_IO编程案例三_字符串逆序显示;

import java.util.Arrays;

public class Menu {
    private IStringService stringService;

    public Menu(){
        this.stringService = Factory.getInstance();
        this.choose();
    }

    public void choose(){
        this.show();
        String choose = InputUtil.getString("请进行选择:");
        switch (choose){
            case"1":{  //接受输入数据
                String str = InputUtil.getString("请输入字符串数据:");
                this.stringService.append(str);    //进行数据的保存
                choose(); //重复出现

            }
            case"2":{  //逆序显示数据
                String result[] = this.stringService.reverse();
                System.out.println(Arrays.toString(result));    //输出
                choose();

            }
            case"0":{
                System.out.println("下次再见，拜拜");
                System.exit(1);
            }
            default:{
                System.out.println("您输入了非法的选项，无法进行处理，请确认后再次执行程序");
                choose();
            }
        }
    }

    public void show(){
        System.out.println("【1】追加字符串数据");
        System.out.println("【2】逆序显示所有的字符串数据");
        System.out.println("【0】结束程序执行");
        System.out.println("\n\n");
    }
}
