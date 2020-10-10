package 第8节_反射调用方法;
//范例：自定义方法信息显示（了解即可）
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class demo2 {
    public static void main(String[] args) {
        Class<?> cls = Person.class;
        Method methods[] = cls.getMethods();
        for (Method met : methods){
            int mod = met.getModifiers();  //获取修饰符
            System.out.print(Modifier.toString(mod) +" ");
            System.out.print(met.getReturnType().getName()+" ");  //获取返回类型;(不加getName有的方法会有class)
            System.out.print(met.getName()+"(");  //获取方法名称
            Class<?> params[] = met.getParameterTypes();  //获取参数类型
            for (int i=0;i<params.length;i++){
                System.out.print(params[i].getName()+" "+"arg-"+i);
                if (i < params.length-1){
                    System.out.print(",");
                }
            }
            System.out.print(")");
            Class<?> exp[] = met.getExceptionTypes();
            if (exp.length>0) {
                System.out.print(" throws");
            }
            for (int i = 0; i < exp.length; i++) {
                System.out.print(exp[i].getName());
                if (i <exp.length-1){
                    System.out.println(",");
                }
            }
            System.out.println();  //赤裸裸的换行
        }
    }
}
