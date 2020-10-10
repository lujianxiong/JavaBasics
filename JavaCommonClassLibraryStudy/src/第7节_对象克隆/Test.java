package 第7节_对象克隆;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Member memberA = new Member("张三",30);
        Member memberB = (Member)memberA.clone();   //clone返回的对象是Object类型，必须要向下转型
        System.out.println(memberA);
        System.out.println(memberB);
    }
}
