package Daxiong.第10_18节_链表数据增加;

public class Test {
    public static void main(String[] args) {
        ILink<String> all = new LinkImpl<>();
        System.out.println("--------------------------获取链表数据内容-------------------------------");
        System.out.println("【增加之前】数据个数："+all.size()+"、 是否为空集合："+all.isEmpty());
        all.add("Hello");
        all.add("This is Daxiong speaking");
        all.add("123");
        all.add("笔芯");
        all.add("111");
        all.add("111");

        Object result[] = all.toArray();
        for(Object temp:result){
            System.out.println(temp);
        }
        System.out.println("【增加之后】数据个数："+all.size()+"、 是否为空集合："+all.isEmpty());

        System.out.println("--------------------------根据索引获取数据-------------------------------");
        System.out.println("获取第1个索引处和第3个索引处的数据：");
        System.out.println(all.get(1));
        System.out.println(all.get(3));

        System.out.println("--------------------------指定索引修改数据-------------------------------");
        System.out.println("修改索引2处的数据为“爱你哟-_-”");
        all.set(2,"爱你哟-_-");
        System.out.println("查看此时链表内容：");
        Object res[] = all.toArray();
        for(Object temp:res){
            System.out.println(temp);
        }

        System.out.println("------------------------判断数据是否在链表内-------------------------------");
        System.out.println("“爱你哟-_-”是否在链表中："+all.contains("爱你哟-_-"));

        System.out.println("-------------------------删除链表内指定数据-------------------------------");
        all.remove("111");
        System.out.println("删除“111”后，链表中的数据：");
        Object result2[] = all.toArray();
        for(Object temp:result2){
            System.out.println(temp);
        }
        //有个需要注意的小问题，在删除的时候，如果链表中有多个相同的数据，只会删除第一个！

        System.out.println("---------------------------清空链表数据----------------------------------");
        all.clean();
        System.out.println("查看链表内容");
        Object r[] = all.toArray();
        if(r != null) {    //这里要加判断，否则会空指针异常
            for (Object temp : r) {
                System.out.println(temp);
            }
        }
        System.out.println("【查询链表】数据个数："+all.size()+"、 是否为空集合："+all.isEmpty());
        
        System.out.println("我们来get索引1处的数据来瞧瞧：");
        System.out.println(all.get(1));



        //为什么返回数据的数组用Object类型而不使用String类型，就是为了和泛型配合，具有良好的扩展性。例如下面这部分代码：
        System.out.println("-------------------------测试Integer类型数据-----------------------------");
        ILink<Integer> b = new LinkImpl<>();
        b.add(520);
        b.add(1314);
        Object re[] = b.toArray();
        for(Object obj:re){
            System.out.println(obj);
        }
    }
}
