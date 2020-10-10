package 第13节_认识正则表达式;
//范例：观察转型、判断、计算
public class demo1 {
    public static void main(String[] args) {
        String str = "123";
        if (isNumber(str)){
            int num = Integer.parseInt(str);
            System.out.println(num*2);
        }

    }

    public static boolean isNumber(String str) {
        char data[] = str.toCharArray();
        for (int x=0;x<data.length;x++){
            if (data[x]>'0' && data[x]<'9'){
                return true;
            }
        }
        return false;
    }
}
