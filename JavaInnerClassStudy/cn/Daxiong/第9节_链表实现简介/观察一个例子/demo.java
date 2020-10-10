package Daxiong.第9节_链表实现简介.观察一个例子;
//直接操作Node
public class demo {
    public static void main(String[] args) {
        Node<String> n1 = new Node<>("火车头");    //存数据
        Node<String> n2 = new Node<>("车厢一");
        Node<String> n3 = new Node<>("车厢二");
        Node<String> n4 = new Node<>("车厢三");
        Node<String> n5 = new Node<>("车厢四");
        Node<String> n6 = new Node<>("车厢五");

        n1.setNext(n2); //设置下一个节点          //数据要是都这么设置还玩吗？     就干脆别用这个结构了，还没对象数组简单
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);

        print(n1);   //输出



        Node<Integer> a1 = new Node<>(123);
        Node<Integer> a2 = new Node<>(456);
        Node<Integer> a3 = new Node<>(789);
        a1.setNext(a2);
        a2.setNext(a3);
        print(a1);
    }

    //定义输出的方法
    public static void print(Node<?> node){
        //这里使用通配符的原因？  如果不使用通配符而是写String或其他，这个print函数只可以输出一种数据类型，
        //只可以在一种场景下使用，扩展性不够
        if(node != null){     //有节点
            System.out.println(node.getData());
            print(node.getNext());  //递归调用
        }
    }
}
