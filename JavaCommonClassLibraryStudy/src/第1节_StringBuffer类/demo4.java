package 第1节_StringBuffer类;
//StringBuffer类 插入数据： public StringBuffer insert(int offset,数据类型 数据)
public class demo4 {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append(".com").insert(0,"www.").insert(4,"Daxiong");
        System.out.println(buf);
    }
}
