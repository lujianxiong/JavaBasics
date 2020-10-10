package 第14节_集合输出_ListIterator双向迭代输出;
//ListIterator只能用于List集合的输出
import java.util.*;

public class demo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("Hello");
        all.add("World");
        all.add("Daxiong～");

        ListIterator<String> iterator = all.listIterator();
        System.out.print("由前向后输出：");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"、");
        }

        System.out.print("\n由后向前输出：");
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous()+"、");
        }
    }
}
