package 第43节_国家代码与信息显示_类库案例七;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageUtil {
    public static final int CHINA = 1;
    public static final int USA = 2;
    private static final String KEY = "info";
    private static final String BASENAME = "cn.daxiong.message.Message";

    public String getMessage(int num){
        Locale loc = getLocale(num);
        if (loc == null){
            return "Nothing";
        }else{
            return ResourceBundle.getBundle(BASENAME,loc).getString(KEY);
        }
    }

    private Locale getLocale(int num){
        switch (num){
            case CHINA:
                return new Locale("zh","CN");
            case USA:
                return new Locale("en","US");
                default:
                    return null;
        }
    }

}
