package 第32节_IO编程案例七_投票选举;

public interface IVoteService {
    public boolean inc(long sid);  //根据编号进行票数增长 【increase：增长】
    public Student[] result();  //获取投票排序后的结果
    public Student[] getData();  //获取全部数据

}
