package 第9节_定义枚举类型;

public class Test2 {
    public static void main(String[] args) {
        Color c = Color.红色;
        switch(c){  //直接支持枚举对象
            case 红色:
                System.out.println("红色");
                break;
            case 绿色:
                System.out.println("绿色");
                break;
            case 蓝色:
                System.out.println("蓝色");
                break;
        }
    }
}
