package 第24节_Annotation整合工厂设计模式;

public class demo {
    public static void main(String[] args) {
        MessageService messageService = new MessageService();
        messageService.send("Daxiong~");
    }
}
