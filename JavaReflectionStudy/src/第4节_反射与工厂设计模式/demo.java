package 第4节_反射与工厂设计模式;
//范例：工厂设计模式（反射+泛型）
public class demo {
    public static void main(String[] args) {
        IMessage message = Factory.getInstance("第4节_反射与工厂设计模式.CloudMessage",IMessage.class);
        message.send();
        IService service = Factory.getInstance("第4节_反射与工厂设计模式.HouseService",IService.class);
        service.service();

    }
}
