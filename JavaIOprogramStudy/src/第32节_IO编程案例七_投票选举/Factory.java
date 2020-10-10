package 第32节_IO编程案例七_投票选举;

public class Factory {
    private Factory() {}

    public static IVoteService getInstance() {
        return new VoteServiceImpl();
    }
}
