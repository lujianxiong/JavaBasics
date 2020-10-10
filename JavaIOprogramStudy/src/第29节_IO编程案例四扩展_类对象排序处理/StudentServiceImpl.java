package 第29节_IO编程案例四扩展_类对象排序处理;

import java.io.File;
import java.util.Arrays;

public class StudentServiceImpl implements IStudentService {
    private static final File SAVE_FILE = new File("e:"+File.separator+"hello"+File.separator+"Student.txt");
    private String content;
    private Student[] students;

    public StudentServiceImpl() {
        this.content = FileUtil.load(SAVE_FILE);   //从文件中读取已有的内容
        this.handle();   //在构造中进行数据拆分的处理
    }

    private void handle(){    //进行字符串的数据处理操作
        if (this.content == null || "".equals(this.content)){
            return ;    //没有数据可处理
        }
        String result[] = this.content.split("\\|");  //将每个对象拆分开
        this.students = new Student[result.length];
        for (int i = 0; i < students.length; i++) {
            String temp[] = result[i].split(":");  //将姓名和年龄进行拆分
            this.students[i] = new Student(temp[0],Double.parseDouble(temp[1]));
        }
    }

    //进行数据追加
    @Override
    public void append(String str) {
        if (str.startsWith("|")){  //最前面有"|"
            str = str.substring(1);   //从1开始截取到结尾
        }
        if (!str.endsWith("|")){  //如果数据结尾没有"|"
            str = str+"|";   //在字符串后面加"|"
        }
        FileUtil.append(SAVE_FILE,str);   //调用FileUtile中的append方法进行数据追加
    }

    @Override
    public Student[] getData() {
        Arrays.sort(this.students);    //对Student对象数组进行排序处理
        return this.students;
    }
}
