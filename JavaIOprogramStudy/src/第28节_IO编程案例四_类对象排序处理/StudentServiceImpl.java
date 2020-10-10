package 第28节_IO编程案例四_类对象排序处理;

import java.util.Arrays;

public class StudentServiceImpl implements IStudentService{
    private String content;
    private Student[] students;

    public StudentServiceImpl(String content) {
        this.content = content;
        this.handle();   //在构造中进行数据拆分的处理
    }

    private void handle(){    //进行字符串的数据处理操作
        String result[] = this.content.split("\\|");  //将每个对象拆分开
        this.students = new Student[result.length];
        for (int i = 0; i < students.length; i++) {
            String temp[] = result[i].split(":");  //将姓名和年龄进行拆分
            this.students[i] = new Student(temp[0],Double.parseDouble(temp[1]));
        }
    }
    @Override
    public Student[] getData() {
        Arrays.sort(this.students);    //对Student对象数组进行排序处理
        return this.students;
    }
}
