package 第29节_IO编程案例四扩展_类对象排序处理;

import java.util.Arrays;

public class Menu {
    public Menu(){
        this.choose();
    }

    public void choose(){
        this.show();
        String choose = InputUtil.getString("请进行选择:");
        switch (choose){
            case"1":{  //接受输入数据
                String str = InputUtil.getString("请输入追加的数据:");
                IStudentService studentService =  Factory.getInstance();
                studentService.append(str);  //追加数据
                choose(); //重复出现

            }
            case"2":{  //显示数据
                IStudentService studentService = Factory.getInstance();
                System.out.println(Arrays.toString(studentService.getData()));
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
        System.out.println("【2】显示所有学生数据");
        System.out.println("【0】结束程序执行");
        System.out.println("\n\n");
    }
}
