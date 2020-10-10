package 第25节_IO编程案例一_输入数字大小比较;

public class IOCaseDemo {
    public static void main(String[] args) {
        INumberService ns = Factory.getInstance();
        int result[] = ns.stat(5);
        System.out.println("最大值："+result[0]+"、最小值："+result[1]);
    }
}

//需要注意的是，在我这个环境中，输入字母的时候的判断，循环好像有点问题，不能正常停止
