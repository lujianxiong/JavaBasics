package 第8节_多例设计模式;
//多例设计模式（多例设计模式与单例模式的本质其实是相同的）
//定义描述颜色的类
public class Color {
    private static final Color RED = new Color("红色");
    private static final Color GREEN = new Color("绿色");
    private static final Color BLUE = new Color("蓝色");
    private String title;

    private Color(String title){   //构造方法私有化
        this.title = title;
    }

    public String toString(){
        return this.title;
    }

    public static Color getInstance(String Color){
        switch(Color){    //switch在JDK1.7之后支持的字符串
            case "red": return RED;
            case "green": return GREEN;
            case "blue": return BLUE;
            default: return null;
        }
    }
}
