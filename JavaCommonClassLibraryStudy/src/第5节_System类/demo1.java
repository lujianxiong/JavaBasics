package 第5节_System类;

public class demo1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "";
        for (int x=0;x<10000;x++){
            str+=x;   //产生大量的垃圾空间
        }
        long end =  System.currentTimeMillis();
        System.out.println("操作耗时："+(end - start));
        //currentTimeMillis是以毫秒为单位的
        //System.gc();
    }
}
