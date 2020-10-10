package 第7节_对象克隆;

public class Member implements Cloneable{
    private String name;
    private int age;

    public Member(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "【"+super.toString()+"】 name = "+this.name+"、age = "+this.age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
