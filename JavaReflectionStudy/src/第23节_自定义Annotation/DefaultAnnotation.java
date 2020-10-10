package 第23节_自定义Annotation;
//自定义Annotation 【在IDEA建class文件的时候选择Annotation类型】

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)  //定义Annotation为运行时生效
public @interface DefaultAnnotation {
    public String title();  //获取数据
    public String url()default "大雄最棒啦～";   //获取数据  ，default表示的是默认值
}
