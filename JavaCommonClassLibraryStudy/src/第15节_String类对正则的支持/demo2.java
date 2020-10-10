package 第15节_String类对正则的支持;
//String类 正则 替换【Stting类的replaceAll方法】
public class demo2 {
    public static void main(String[] args) {
        String str = "123456to654321";
        String regex = "\\d";
        System.out.println(str.replaceAll(regex,"888"));
        System.out.println(str.replaceFirst(regex,"999999"));

        String regex1 = "\\d{4}";
        System.out.println(str.replaceAll(regex1,"0"));
        System.out.println(str.replaceFirst(regex1,"999999"));
    }
}
//我们总结一下String类的替换，replaceAll和repalceFirst：首先要清楚正则表达式里进行操作的字符数量是几
//若是【单字符 - replaceAll】的话，是将输入的字符串中的每个字符都替换为待替换的字符串
//若是【单字符 - replaceFirst】的话，是将输入的字符串中的第一个字符替换为待替换的字符串

//若是【多字符 - replaceAll】的话，是将正则表达式里指定的数量的字符串替换为待替换的字符串，输入的字符串数量是正则里的数量的几倍就替换几次。
//若是【多字符 - replaceFirst】的话，是将字符串中第一组正则里指定的数量的字符串替换为待替换字符串。