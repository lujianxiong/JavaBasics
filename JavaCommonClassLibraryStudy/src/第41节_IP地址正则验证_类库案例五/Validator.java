package 第41节_IP地址正则验证_类库案例五;
//对IP地址验证
public class Validator {
    public static boolean validateIP(String ip){
        //判断为空处理
        if (ip == null || "".equals(ip)) {
            return false;
        }

        //对IP的结构进行验证
        String regex = "([12]?\\d?\\d?\\.){3}([12]?\\d?\\d?)";

        //对IP的范围进行验证
        if (ip.matches(regex)){  //如果验证通过，还需要对IP地址进行拆分处理
            String result[] = ip.split("\\.");    //根据.拆分数据
            for (int x=0;x<result.length;x++){
                int temp = Integer.parseInt(result[x]);   //将字符串转为int型
                if (temp > 255){
                    return false;
                }
            }
        }else {  //对验证不通过的情况要进行处理。否则对结构验证没通过的话，跳过对范围的验证，会返回true
             return false;
        }
        return true;
    }
}

//？：表示出现0次或1次
//{n}：表示出现n次
