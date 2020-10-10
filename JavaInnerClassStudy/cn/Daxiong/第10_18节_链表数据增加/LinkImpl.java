package Daxiong.第10_18节_链表数据增加;

public class LinkImpl<E> implements ILink<E> {

    private Node root;    //根元素
    private int count = 0;    //数据个数
    private int foot;    //操作数组的脚标（返回链表数据中）
    private Object[] returnData;    //返回数据的数组


    @Override
    public void add(E e){
        if(e == null){    //保存的数据为null
            return ;    //方法调用直接结束
        }

        Node newNode = new Node(e);    //创建一个新的节点保存输入的内容

        if(this.root == null){
            this.root = newNode;   //这个刚创建的节点作为根节点
        }else{
            this.root.addNode(newNode);    //将新节点保存在合适的位置
        }
        this.count++;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
        //return this.root == null;
        return this.count == 0;   //根据节点数是否为0来判断，节点数为0就说明集合为空
    }

    @Override
    public Object[] toArray() {
        //先判断是否是空集合
        if(this.isEmpty()){
            return null;   //返回空，没有数据
        }
        this.foot = 0;  //脚标置0
        this.returnData = new Object[this.count];    //根据节点个数开辟数组
        //利用Node类进行递归数据获取
        this.root.toArrayNode();
        return this.returnData;
    }

    @Override
    public E get(int index) {
        if(index>=this.count){   //索引必须小于count。  最大索引index = count-1
            return null;
        }
        //利用Node类获取指定索引处的数据
        this.foot = 0;    //重置索引的下标 (从索引0出往后遍历，比较index与foot是否相等)
        return this.root.getNode(index);
    }

    @Override
    public void set(int index, E data) {
        if(index>=this.count){
            return ;    //无返回值，方法结束
        }
        //利用Node类获取指定索引处的数据
        this.foot = 0;    //重置索引的下标
        this.root.setNode(index,data);
    }

    @Override
    public boolean contains(E data) {
        if(data == null){    //传的数据值为空则返回false
            return false;
        }
        return this.root.containsNode(data);
    }

    @Override
    public void remove(E data) {
        //在这个方法中定义删除根节点的操作
        if(this.contains(data)){   //判断有这个数据存在，存在的话执行删除，不存在不玩了
            if(this.root.data.equals(data)){  // 根节点即要删除的节点
                 this.root = this.root.next;    //将根节点置为根节点的下一个节点
            }else{    //要删除的节点不是根节点，交由Node类负责删除
                this.root.next.removeNode(this.root,data);   //传两个参数，一个是上一个节点，一个是要删除的数据
            }
            this.count --;  //数组长度-1
        }
    }

    @Override
    public void clean() {
        this.root = null;    //将根节点为空，后续的所有节点都没了
        this.count = 0;     //个数清零
    }


    //-------------------------------内部类 Node:保存节点的数据关系--------------------------------
    private class Node{
        private E data;    //数据
        private Node next;    //下一个节点

        private Node(E data){    //构造方法
             this.data = data;
        }

        public void addNode(Node newNode){    // 保存数据的具体实现方法
            if(this.next == null){    //当前节点的下一个节点为空，
                this.next = newNode;    //保存当前节点
            }else{
                this.next.addNode(newNode);    //继续往后判断，递归调用addNode方法
            }
        }

        public void toArrayNode(){    //链表元素以数组形式返回具体实现
            LinkImpl.this.returnData[LinkImpl.this.foot++] = this.data;
            if(this.next != null){    //后面如果还有数据
                this.next.toArrayNode();  //递归调用
            }
        }

        public E getNode(int index){
            if(LinkImpl.this.foot++ == index){  //索引相同
                return this.data;  //返回当前数据
            }else{
                return this.next.getNode(index);    //递归遍历整个链表，匹配index处并返回数据
            }
        }

        public void setNode(int index,E data){
            if(LinkImpl.this.foot++ == index){  //索引相同
                this.data = data;  //修改数据
            }else{
                this.next.setNode(index,data);    //递归遍历整个链表，匹配index处并修改数据
            }
        }

        public boolean containsNode(E data){
            //这下面的equals要掉个个，因为如果data输入的为空，这样可以避免程序的异常
            if(data.equals(this.data)){    //通过equals方法进行对象的比较(从当前节点开始比较)
                return true;
            }else{
                if(this.next ==null){  //没有后续节点了，返回false
                    return false;
                }else{
                    return this.next.containsNode(data);    //向后继续递归判断
                }
            }
        }

        public void removeNode(Node previous,E data){   //上一个节点previous ,要删除的数据data
            if(this.data.equals(data)){
                previous.next = this.next;   //将当前节点的下一个变成上一个节点的下一个节点（空出当前节点）
            }else{
                if(this.next != null){    //当前数据不是要删除的数据，如果有后续节点，向后继续递归遍历
                     this.next.removeNode(this,data);    //向后继续递归遍历
                }
            }
        }

    }
}
