package 第7节_单例设计模式;

public class Test {
    public static void main(String[] args) {
        Singleton instance = null;
        instance = Singleton.getInstance();
        instance.println();

        Singleton2 instence2 = null;
        instence2 = Singleton2.getInstance();
        instence2.println();
    }
}
