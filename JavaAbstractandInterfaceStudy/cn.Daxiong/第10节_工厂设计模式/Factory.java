package 第10节_工厂设计模式;
//工厂设计模式
public class Factory {
    public static IFood getIntense(String className){
        if("bread".equals(className)){
            return new Bread();
        }else if("milk".equals(className)){
            return new Milk();
        }else{
            return null;
        }
    }
}
