package 第1节_StringBuffer类;
//StringBuffer类　删除指定范围的数据：public StringBuffer delete(int start,int end)
public class demo5 {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello World!").delete(6,12).insert(6,"Daxiong");    //追加完数据之后,删除第6个"W"到第12个"!"之间的数据
        System.out.println(buf);
    }
}
