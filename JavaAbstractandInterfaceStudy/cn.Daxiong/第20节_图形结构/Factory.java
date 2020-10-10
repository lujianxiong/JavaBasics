package 第20节_图形结构;
//定义一个抽象工厂
//工厂不止可以用在接口上，也可以用在抽象类上
//工厂设计模式的目的就是隐藏所有实现的子类
public class Factory {
    public static AbstractShape getInstance(String className,double ... args){
        if("Circular".equalsIgnoreCase(className)){
            return new Circular(args[0]);
        }else if("Rectangle".equalsIgnoreCase(className)){
            return new Rectangle(args[0],args[1]);
        }else{
            return null;
        }
    }
}
