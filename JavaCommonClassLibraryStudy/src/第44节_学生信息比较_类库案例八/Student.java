package 第44节_学生信息比较_类库案例八;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "【学生信息】姓名："+this.name+"、年龄："+this.age+"、成绩："+this.score;
    }

    @Override
    public int compareTo(Student stu) {  //采用降序（当前对象比传入的对象小的时候返回1，大的时候返回-1）
        if (score < stu.score){
            return 1;
        }else if(score > stu.score){
            return -1;
        }else{   //当成绩相等的时候，按照年龄排序
            return this.age - stu.age;
        }
    }
}
