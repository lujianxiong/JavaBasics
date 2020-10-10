package 第15节_String类对正则的支持;
//String类 正则 分割【Stting类的split方法】
public class demo3 {
    public static void main(String[] args) {
        String str = "241824814you1242152you58648!!!124324";
        String regex = "\\D";   //试试\\D{3}
        String result[] = str.split(regex);
        for (String s : result) {
            System.out.println(s);
        }
    }
}

//详解一下split是根据正则的规则作为分界来分割，你会发现，当正则中是多字符与输入的字符串中的非数字字符连续长度一致时，输出是最漂亮的
//正则中若是单字符，，则字符串中分界线就是单字符，若字符串中非数字字符连续长度大于1个字符，输出就会出现空白。