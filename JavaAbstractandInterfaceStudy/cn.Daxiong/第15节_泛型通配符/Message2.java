package 第15节_泛型通配符;
//泛型的上限
public class Message2 <T extends Number>{
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
