package 第17_18节_ClassLoader类加载器简介;
//第十七节：范例：观察类加载器
public class demo1 {
    public static void main(String[] args) {
        Class<?> clazz = Message.class;  //得到Message类实例化对象
        System.out.println(clazz.getClassLoader());  //获取当前类的加载器
        System.out.println(clazz.getClassLoader().getParent());  //获取父类加载器
        System.out.println(clazz.getClassLoader().getParent().getParent());  //获取祖父类加载器

    }
}

//sun.misc.Launcher$AppClassLoader@18b4aac2    //应用程序加载器
//sun.misc.Launcher$ExtClassLoader@1b6d3586    //平台类加载器
//null