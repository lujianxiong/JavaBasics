package 第30节_Stream数据流_MapReduce基础模型;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class demo {
    public static void main(String[] args) throws Exception{
        //如果要想使用Stream进行分析处理,则一定要将全部要分析的数据保存在集合之中
        List<Order> all = new ArrayList<>();
        all.add(new Order("大雄娃娃",9.99,10));
        all.add(new Order("大雄版铃鹿御前",100,1));
        all.add(new Order("炼狱茨木童子",8888,2));
        all.add(new Order("大雄牌笔记本电脑",999999,8));
        all.add(new Order("大雄玩偶",50,100));
        //要分析购买商品之中带有"雄"的信息数据,并且进行商品单价和数量的处理,随后进行分析汇总
        DoubleSummaryStatistics stat = all.stream().filter((ele) -> ele.getName().contains("雄")).mapToDouble((orderObject) -> orderObject.getPrice() * orderObject.getAmount()).summaryStatistics();//filter表示过滤
        System.out.println("购买数量"+stat.getCount());
        System.out.println("购买总价"+stat.getSum());
        System.out.println("平均花费"+stat.getAverage());
        System.out.println("最高花费"+stat.getMax());
        System.out.println("最低花费"+stat.getMin());
    }
}
