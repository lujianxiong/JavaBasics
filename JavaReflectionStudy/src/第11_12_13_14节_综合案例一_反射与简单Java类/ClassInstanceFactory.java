package 第11_12_13_14节_综合案例一_反射与简单Java类;

public class ClassInstanceFactory {
    private ClassInstanceFactory(){}

    /**
     * 实例化对象的创建方法，该对象可以根据传入的字符串结构“属性：内容|属性：内容”
     * @param clazz    要进行反射实例化的Class类对象，有Class就可以反射实例化对象
     * @param value    要设置给对象的属性内容
     * @param <T>
     * @return    返回一个已经配置好属性的Java类对象
     */
    public static <T> T create(Class<?> clazz,String value){

        try {//如果要想采用反射进行简单Java类对象属性设置的时候，类中必须要有无参构造
            Object obj = clazz.getDeclaredConstructor().newInstance();
            BeanUtils.setValue(obj,value);  //通过反射为obj对象设置属性
            return (T)obj;  //返回对象（转型）
        } catch (Exception e) {
            e.printStackTrace();  //如果此时真的出现了错误，从本质上来将抛出异常也没用
            return null;
        }
    }
}
