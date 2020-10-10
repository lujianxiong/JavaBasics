package 第24节_Annotation整合工厂设计模式;

public class Factory {
    private Factory(){}
    public static <T> T getInstance(Class<T> clazz){  //直接返回一个实例化的操作对象
        try {
            return (T) new MessageProxy().bind(clazz.getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
