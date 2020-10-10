package 第33节_34节_二叉树基础实现及数据查询;

public class Test {
    public static void main(String[] args) {
        MapBinaryTree<Integer,Person> tree = new MapBinaryTree<>();
        tree.add(80,new Person("小强-80",80));
        tree.add(30,new Person("小强-30",30));
        tree.add(50,new Person("小强-50",50));
        tree.add(60,new Person("小强-60",60));
        tree.add(90,new Person("小强-90",90));

        //根据key查询是否存在
        System.out.println(tree.contains(90));

        //根据key获取对应value数据
        System.out.println(tree.get(90));

        //输出全部数据
        //Object results[] = tree.toArray();
        //for (Object obj : results){
        //    MapBinaryTree.Entry<Integer,Person> entry = (MapBinaryTree.Entry<Integer,Person>)obj;
        //    System.out.println(entry.getKey()+"----"+entry.getValue());
        //}

    }
}
