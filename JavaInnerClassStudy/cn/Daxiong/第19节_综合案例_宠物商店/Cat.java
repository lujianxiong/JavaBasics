package Daxiong.第19节_综合案例_宠物商店;
//宠物猫
public class Cat implements Pet{    //实现宠物标准
    private String name;
    private String color;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "【宠物猫】 名字："+this.name+"、颜色："+this.color;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){        //判断传出的值是否为空
            return false;
        }
        if(!(obj instanceof Cat)){       //instanceof 是用来测试一个对象是否为一个类的实例
            return false;
        }
        if(this == obj){
            return true;
        }
        Cat cat = (Cat)obj;
        return this.name.equals(cat.name) && this.color.equals(cat.color);     //对name和color分别调用equals方法
    }

}
