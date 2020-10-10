package Daxiong.第19节_综合案例_宠物商店;

public class Dog implements Pet{
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

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "【宠物狗】 名字："+this.name+"、颜色："+this.color;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){        //判断传出的值是否为空
            return false;
        }
        if(!(obj instanceof Dog)){       //instanceof 是用来测试一个对象是否为一个类的实例
            return false;
        }
        if(this == obj){
            return true;
        }
        Dog dog = (Dog)obj;
        return this.name.equals(dog.name) && this.color.equals(dog.color);   //对name和color分别调用equals方法
    }
}
