package 第29节_IO编程案例四扩展_类对象排序处理;
//定义Student类继承Comparable接口并定义排序规则
public class Student implements Comparable<Student>{
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "姓名:"+this.name+" 、成绩："+this.score;
    }

    //由高到低排序
    @Override
    public int compareTo(Student s) {
        if (this.score > s.score){
            return -1;
        }else if (this.score < s.score){
            return 1;
        }else {
            return 0;
        }
    }
}
