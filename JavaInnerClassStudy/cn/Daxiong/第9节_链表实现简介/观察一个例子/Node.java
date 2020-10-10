package Daxiong.第9节_链表实现简介.观察一个例子;
//直接操作Node
public class Node <E>{
    private E data;
    private Node next;
    public Node(E data){
        this.data = data;
    }

    public E getData(){
        return this.data;
    }

    public void setNext(Node<E> next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }
}
