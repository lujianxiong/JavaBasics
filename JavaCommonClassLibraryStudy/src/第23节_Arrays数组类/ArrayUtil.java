package 第23节_Arrays数组类;

public class ArrayUtil {
    private ArrayUtil(){};
    /**
     * 进行数组数据的二分查找操作
     * @param data 要进行查找的数组
     * @param key  要查找的数据
     * @return   找到数据返回的数据的索引，找不到返回负数。
     */
    public static int binarySearch(int data[],int key){
        if (data !=null){
            return binarySearchDefault(data,0,data.length,key);
        }
        return -1;
    }

    /**
     * 实现一个二分查找的具体实现方法
     * @param data  要进行查找的原始数组
     * @param fromIndex  开始索引
     * @param toIndex  结束索引（数组长度）
     * @param key  查询的数据
     * @return  查找到数据返回索引，找不到返回负数（-1）
     */
    public static int binarySearchDefault(int data[],int fromIndex,int toIndex,int key){
        int low = fromIndex;    //左索引
        int high = toIndex;    //右索引
        while (low <= high){    // 结束条件
            int middle = (low+high)/2;    //计算中间的索引数据
            if (data[middle] == key){  //查找到了
                return middle;  //返回索引
            }else if(key < data[middle]){   //如果小于中间值，往左查
                high = middle-1;
            }else{
                low = middle+1;
            }
        }
        return -1;    //如while循环没查询到数据，则返回-1
    }
}
