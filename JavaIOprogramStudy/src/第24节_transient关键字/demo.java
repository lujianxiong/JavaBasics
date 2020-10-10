package 第24节_transient关键字;
//范例：实现序列化与反序列化
import java.io.*;

public class demo {
    private static final File SAVE_FILE = new File("e:"+File.separator+"hello"+File.separator+"Daxiong.Person.txt");
    public static void main(String[] args) throws Exception{
        //saveObject(new Person("daxiong",20));
        System.out.println(loadObject());

    }

    public static void saveObject(Object obj) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVE_FILE));
        oos.writeObject(obj);    //序列化
        oos.close();
    }

    public static Object loadObject() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SAVE_FILE));
        Object obj = ois.readObject();    //反序列化
        ois.close();
        return obj;
    }
}
