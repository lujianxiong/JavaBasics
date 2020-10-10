package 第32节_IO编程案例七_投票选举;

import java.util.Arrays;

public class VoteServiceImpl implements IVoteService{
    //实例化Student类对象数组
    private Student[] students = new Student[]{
            new Student(1,"张三",0),
            new Student(2,"李四",0),
            new Student(3,"王五",0),
            new Student(4,"赵六",0)
    };

    @Override
    public boolean inc(long sid) {
        for (int i = 0; i < students.length; i++) {
            if (this.students[i].getSid() == sid){  //获取指定的编号
                this.students[i].setVote(this.students[i].getVote()+1); //票数+1
                return true;
            }
        }
        return false;
    }

    @Override
    public Student[] result() {
        Arrays.sort(this.students);  //根据票数对Student类对象进行排序
        return this.students;
    }

    @Override
    public Student[] getData() {
        return this.students;
    }
}
