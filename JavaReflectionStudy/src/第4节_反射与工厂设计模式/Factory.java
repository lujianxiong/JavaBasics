package 第4节_反射与工厂设计模式;
//范例：工厂设计模式（反射+泛型）
public class Factory {
    private Factory(){}   //构造方法私有化

    /**
     * 获取接口实例化对象
     * @param className  接口的子类名称
     * @param clazz  接口的类型
     * @param <T>
     * @return  如果子类存在，就返回指定接口实例化对象
     */
    public static <T> T getInstance(String className,Class<T> clazz) {
        T instance = null;
        try {
            instance = (T)Class.forName(className).newInstance();  //JDK1.9以前这样用，1.9以后： .getDeclaredConstructor.newInstance()
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
}
