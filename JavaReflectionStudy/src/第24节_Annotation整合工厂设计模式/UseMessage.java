package 第24节_Annotation整合工厂设计模式;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface UseMessage {
    public Class<?> clazz();
}
