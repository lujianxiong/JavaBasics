package 第15节_泛型通配符;
//观察问题的产生
public class Message <T>{
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
