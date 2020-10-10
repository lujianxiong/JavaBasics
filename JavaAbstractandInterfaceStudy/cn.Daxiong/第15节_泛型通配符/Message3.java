package 第15节_泛型通配符;
//泛型的下限
//泛型下限不需要在类里面super 类，直接在方法中加；
public class Message3<T>{
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
