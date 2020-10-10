package Daxiong.第7节_方法引用.引用静态方法;

//P描述的是参数类型，R描述的是返回值类型
//泛型实际上描述的是一种对象类型
public interface IFunction<P,R> {
    //public R 转换(P p);    //可以使用中文名，但是一般不这么用
    public R change(P p);
}
