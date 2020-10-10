package Daxiong.第7节_异常处理模型;
//范例：异常处理标准格式：
public class MyMath {
    //异常交给调用处处理,在此方法中使用throws，将方法抛给调用处(如果这里有多个类型的Exception，可以Exception,Exception 使用逗号隔开)
    public static int div(int x,int y)throws Exception{
        int temp = 0;
        System.out.println("***【 START】除法计算开始 ***");
        try {
            temp = x / y;
        }finally {
            //要想让下面这句话执行，就要对"temp = x / y;"这行代码try，下面这行finally
            System.out.println("***【 END】除法计算结束 ***");
        }

        return temp;
    }
}
//省略了：
//catch (Exception e){
//            throw e;    //向上抛异常对象
//        }