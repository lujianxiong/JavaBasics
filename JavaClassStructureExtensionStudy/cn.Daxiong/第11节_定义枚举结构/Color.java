package 第11节_定义枚举结构;
//定义一个枚举类
public enum Color implements IMessage{
    RED("红色"),GREEN("绿色"),BLUE("蓝色");    //实例化对象（枚举对象一定要放在首行）
    //上面为什么大写，在枚举类里定义的对象是static final的
    //如果只这样写：RED,GREEN,BLUE;会报错，因为在枚举类中没有无参构造，因此要显式调用有参构造
    private String title;  // 定义属性

    private Color(String title){
        this.title = title;
    }

    public String toString(){
        return this.title;
    }

    @Override
    public String getMessage() {
        return this.title;
    }
}
