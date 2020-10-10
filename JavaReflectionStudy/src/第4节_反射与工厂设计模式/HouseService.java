package 第4节_反射与工厂设计模式;
//范例：工厂设计模式（反射+泛型）
public class HouseService implements IService{
    @Override
    public void service() {
        System.out.println("【服务】：为您的住宿提供服务");
    }
}
