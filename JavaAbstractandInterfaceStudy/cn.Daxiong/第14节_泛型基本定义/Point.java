package 第14节_泛型基本定义;

public class Point <T>{    //T是Type的简写，可以定义多个泛型
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}

//此时Point类中的x与y属性的数据类型并不确定，而是由外部来决定，