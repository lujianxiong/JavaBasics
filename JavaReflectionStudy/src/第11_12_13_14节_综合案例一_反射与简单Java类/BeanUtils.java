package 第11_12_13_14节_综合案例一_反射与简单Java类;
//进行Bean处理的类
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BeanUtils {
    private BeanUtils(){}  //私有化的构造方法

    /**
     * 实现指定对象的属性设置
     * @param obj  要进行反射操作的实例化对象
     * @param value  包含有指定内容的字符串，格式“属性：内容|属性：内容”
     */
    public static void setValue(Object obj,String value) {
        String results[] = value.split("\\|");  //按照“|”进行每一组属性的拆分
        for (int x = 0; x< results.length; x++){  //循环设置属性内容
            //attval[0]保存的是属性的名称，attval[1]保存的是属性的内容
            String attval[] = results[x].split(":");  //分离属性名称和属性内容
            try {
                if (attval[0].contains(".")){  //多级配置
                    String temp[] = attval[0].split("\\.");
                    Object currentObject = obj;

                    //进行实例化处理  【【比如：对“dept.company.name:Xiong”中的没有实例化的dept、company进行属性实例化处理】
                    //最后一位是制定类中的属性名称，所以不在本次实例化处理的范畴之类，我们要处理的是引用关系
                    for (int i = 0; i < temp.length-1; i++) {
                        //调用相应的getter方法，如果getter方法返回了null，表示该对象未实例化
                        Method getMethod = currentObject.getClass().getDeclaredMethod("get"+StringUtils.initcap(temp[i]));  //通过Class类获取指定obj类中的的指定getter方法。
                        Object tempObject = getMethod.invoke(currentObject);  //调用getter方法
                        if (tempObject == null){  //null表示该对象未实例化
                            //那我们就实例化该对象
                            Field field = currentObject.getClass().getDeclaredField(temp[i]);  //获取属性类型
                            Method method = currentObject.getClass().getDeclaredMethod("set"+StringUtils.initcap(temp[i]),field.getType());
                            Object newObject = field.getType().getConstructor().newInstance();  //通过反射实例化对象
                            method.invoke(currentObject,newObject);  //在进行setter方法设对应的属性
                            currentObject = newObject;  //将新的实例化对象赋给当前对象
                        }else {  //该对象已经进行实例化了
                            currentObject = tempObject;
                        }
                    }
                    //进行级联属性设置  【比如：对“dept.company.name:Xiong”中的name属性进行赋值“Xiong”】
                    Field field = currentObject.getClass().getDeclaredField(temp[temp.length-1]);  //获取成员  【按照"."拆分出来，temp长度是2的，那么最后一个就是temp[1]，因为是从0开始数的】
                    Method setMethod = currentObject.getClass().getDeclaredMethod("set" + StringUtils.initcap(temp[temp.length-1]), field.getType());
                    Object convertValue = BeanUtils.convertAttributeValue(field.getType().getName(), attval[1]);    //属性的类型名，属性的值
                    setMethod.invoke(currentObject, convertValue);

                }else {  //单级配置
                    Field field = obj.getClass().getDeclaredField(attval[0]);  //获取成员属性
                    Method setMethod = obj.getClass().getDeclaredMethod("set" + StringUtils.initcap(attval[0]), field.getType());  //第一个是方法名、第二个是方法中参数的类型
                    Object convertValue = BeanUtils.convertAttributeValue(field.getType().getName(), attval[1]);    //第一个是属性的类型名，第二个是属性的值 【field及field.getType、field.getTypr.getName返回的分别是什么，参考demoTest】
                    setMethod.invoke(obj, convertValue);  //反射调用setMethod方法   【第一个是操作的类对象，第二个是转换过类型之后的属性的值】
                    //上面这行等同于：obj.setName(convertValue);
                }
            }catch (Exception e){
                //在这里处理try处理异常，不做任何操作；虽然一旦出错，程序可以正常执行。
                //而如果throws向上抛出异常，程序运行就会出现一堆报错。
                //实例化对象的错在工厂类中已经做了抛出异常处理了
                //有一个属性错的话应该不影响我们全局的开发
            }
        }
    }

    /**
     * 实现属性类型转换处理  【convertAttribute: 转换属性】 （根据要设置的内容的属性类型，将value转为各种对应的类型）
     * @param type  属性的类型，通过Field获取的【set方法中需要的参数类型】
     * @param value  属性的内容，传入的都是字符串，需要将其变为指定类型
     * @return  返回转换后的数据
     */
    private static Object convertAttributeValue(String type,String value){
        if ("long".equals(type)||"java.lang.Long".equals(type)){  //长整型
            return Long.parseLong(value);
        }else if ("int".equals(type)||"java.lang.int".equals(type)){  //int型
            return Integer.parseInt(value);
        }else if ("double".equals(type)||"java.lang.double".equals(type)){  //double型
            return Double.parseDouble(value);
        }else if ("java.util.Date".equals(type)){   //日期类型
            SimpleDateFormat sdf = null;
            if (value.matches("\\d{4}-\\d{2}-\\d{2}")){  //日期类型
                sdf = new SimpleDateFormat("yyyy-MM-dd");
            }else if (value.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}")){
                sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            }else{
                return new Date();  //返回当前日期  【至少保证不出错】
            }
            try {
                return sdf.parse(value);
            } catch (ParseException e) {
                return new Date();
            }
        }else {  //字符串类型   ，什么都不做，直接返回
            return value;
        }
    }
}
