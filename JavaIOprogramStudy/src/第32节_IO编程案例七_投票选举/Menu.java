package 第32节_IO编程案例七_投票选举;

public class Menu {
    private IVoteService voteService;

    public Menu(){
        this.voteService = Factory.getInstance();
        this.vote();
    }

    //投票处理
    private void vote() {
        Student stu[] = this.voteService.getData();
        for (Student temp : stu){
            System.out.println(temp.getSid()+" : "+temp.getName()+"【"+temp.getVote()+"】");
        }
        int num = 10;
        while (num != 0){  //循环投票
             num = InputUtil.getInt("请输入班长候选人代号（以数字0结束）：");
             if (num != 0) {
                 if (!this.voteService.inc(num)){   //如果没有匹配的编号
                     System.out.println("此选票无效，请输入正确的候选人代号！");  //如果接收的数字与与Student类对象的编号存在匹配
                 }
             }
        }
        System.out.println("投票最终结果：");
        stu = this.voteService.result();  //获取降序排序后的结果
        System.out.println(stu[0].getName()+"同学，以"+stu[0].getVote()+"票数"+"当选班长");  //输出票数最高的同学的信息
    }


}
