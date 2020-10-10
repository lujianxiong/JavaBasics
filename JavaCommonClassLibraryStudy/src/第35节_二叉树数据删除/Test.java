package 第35节_二叉树数据删除;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        BinaryTree<Person> tree = new BinaryTree<>();
        tree.add(new Person("小强-80", 80));
        tree.add(new Person("小强-50", 50));
        tree.add(new Person("小强-60", 60));
        tree.add(new Person("小强-30", 30));
        tree.add(new Person("小强-90", 90));
        tree.add(new Person("小强-10", 10));
        tree.add(new Person("小强-55", 55));
        tree.add(new Person("小强-70", 70));
        tree.add(new Person("小强-85", 85));
        tree.add(new Person("小强-95", 95));
        //tree.remove(new Person("小强-10", 10));
        //tree.remove(new Person("小强-30", 30));
        tree.remove(new Person("小强-80", 80));

        System.out.println(Arrays.toString(tree.toArray()));

    }
}
