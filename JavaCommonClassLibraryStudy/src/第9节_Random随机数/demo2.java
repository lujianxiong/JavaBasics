package 第9节_Random随机数;

import java.util.Arrays;
import java.util.Random;

//范例：随机生成彩票号
public class demo2 {
    public static void main(String[] args) {
        int data[] = new int [7];    //开辟七个数组长度的空间
        int foot = 0;    //操作data的脚标
        Random random = new Random();
        while (foot<7){
            int num = random.nextInt(37);    //生成一个数字
            if (isUse(num,data)){    //true表示该数字可以使用，符合要求
                data[foot++] = num;    //保存数据并脚标+1
            }
        }
        Arrays.sort(data);
        for (int x=0;x<data.length;x++){
            System.out.print(data[x]+"、");
        }
    }

    /**
     * 判断传入的数字是否为0以及是否已经存在于数组之中
     * @param num  要进行判断的数字
     * @param temp  已经存入的数据
     * @return  如果该数字不是0并且不重复，则返回true，否则返回false
     */
    public static boolean isUse(int num,int temp[]){
        if (num == 0){
            return false;
        }
        for (int x=0;x<temp.length;x++){
            if (num == temp[x]){
                return false;
            }
        }
        return true;
    }
}
