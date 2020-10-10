package 第44节_学生信息比较_类库案例八;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "张三:21:98|李四:22:89|王五:20:70";
        String result[] = str.split("\\|");
        Student students[] = new Student[result.length];
        for (int x =0;x<result.length;x++){
            String temp[] =result[x].split(":");
            students[x] = new Student(temp[0],Integer.parseInt(temp[1]),Double.parseDouble(temp[2]));
        }
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
