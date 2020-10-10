package 第17节_泛型方法;
//通过调用实现两种数据类型的存储
public class demo {
    public static void main(String[] args) {
        Integer num [] = fun(3,2,1);
        for(int temp:num){      //foreach迭代输出
            System.out.println(temp);
        }

        String str [] = fun("Daxiong","CSDN","hello world！","我爱学习","学习爱我");
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }

    //这里定义一个泛型方法，返回一个泛型数组
    //这里写的T应该是一个类型，但是系统里没有，我们要给T加个泛型标记：<T>
    public static <T> T[] fun(T ... args){   // （数据类型 ... 数组名） 这是一个变种数组，这种技术叫方法可变参数
        return args;

    }
}
