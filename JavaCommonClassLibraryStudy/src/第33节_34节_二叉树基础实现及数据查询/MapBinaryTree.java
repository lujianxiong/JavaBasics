package 第33节_34节_二叉树基础实现及数据查询;

/**
 *
 * @param <K> 进行数据存储的key,通过key查询Value,这个key是Comparable的子类
 * @param <V> 保存具体的数据信息
 */
public class MapBinaryTree<K extends Comparable<K>,V>{
    /**
     * 根据key返回Entry的对象，这个对象的类型是V
     * @param <V>
     */
    public static class Entry<K extends Comparable<K>,V> implements Comparable<K>{   //将Comparable和二元偶对象封装在Entry中.Person类作为一个单独的类
        private K key;   //保存key
        private V value;    //保存对象

        public Entry(K key,V value){
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(K key) {
            return this.key.compareTo(key);
        }

        public K getKey(){
            return this.key;
        }

        public V getValue(){
            return this.value;
        }

    }

    private class Node{    //内部类定义Node节点
        private MapBinaryTree.Entry<K,V> data;    //保存节点的数据
        private Node parent;    //保存父节点
        private Node left;    //保存左子树
        private Node right;    //保存右子树

        public Node(MapBinaryTree.Entry<K,V> data){    //构造方法直接存储数据
            this.data = data;
        }

        /**
         * 实现节点数据的适当位置的存储
         * @param newNode    //创建的新节点。
         */
        public void addNode(Node newNode){
            if (newNode.data.key.compareTo(this.data.key) <= 0){   //如果新增节点的数据小于当前节点的数据，将数据放到左子树
                if (this.left == null){    //左子树为空
                    this.left = newNode;    //将新增节点保存为左子树
                    newNode.parent = this;    //将当前节点保存为父节点
                }else{    //否则将新增节点继续向左进行判断
                    this.left.addNode(newNode);    //递归调用，继续向下判断
                }
            }else{     //比当前节点数据要大，存到右边
                if (this.right == null){    //右子树为空
                    this.right = newNode;    //新增节点存到右子树
                    newNode.parent = this;
                }else{    //否则将新增节点继续向下判断
                    this.right.addNode(newNode);
                }

            }
        }

        /**
         * 获取全部数据的具体实现，按照中序遍历的形式完成（中序遍历出来是有序的）
         */
        public void toArrayNode(){    //中序遍历：左、中、右
            if (this.left != null){    //有左子树
                this.left.toArrayNode();    //递归调用
            }

            returnData[foot++] = this.data;   //将数据存到对象数组中

            if (this.right != null){   //有右子树
                this.right.toArrayNode();  //递归调用
            }
        }

        /**
         * 进行数据的检索处理
         * @param data    检索的数据
         * @return    找到返回true，找不到返回false
         */
        public boolean containsNode(MapBinaryTree.Entry<K,V> data) {
            if (data.key.compareTo(this.data.key) == 0){    //要查询的数据就是根节点
                return true;
            }else if(data.key.compareTo(this.data.key) < 0){
                if (this.left != null) {
                    return this.left.containsNode(data);    //对左子树进行递归调用
                }else {
                    return false;
                }
            }else {
                if (this.right != null) {
                    return this.right.containsNode(data);
                }else {
                    return false;
                }
            }

        }

        public V getNode(K key) {
            if (key.compareTo(this.data.key) == 0){  //查找到
                return this.data.value;
            }else if (key.compareTo(this.data.key) <0){  //说明比当前数据小,往左找
                if (this.left != null){
                    return this.left.getNode(key);   //对左子树递归调用
                }
            }else{
                if (this.right != null){
                    return this.right.getNode(key);   //对右子树递归调用
                }
            }
            return null;
        }
    }

    //----------------------------以下为二叉树的功能实现--------------------------------
    private Node root;    //保存的是根节点
    private int count = 0;    //保存数据的个数
    private Object[] returnData;    //返回的数据
    private int foot = 0;    //脚标控制

    /**
     * 数据的保存
     * @Exception   NullPointerException 保存数据为空时抛出的异常
     */
    public void add(K key,V value){
        if (key == null || value ==null){   //数据为空，抛异常
            throw new NullPointerException("保存的数据不允许为空");
        }
        //所有的数据本身不具备有节点关系的匹配，那么一定要将其包装在Node类之中。
        Node newNode = new Node(new MapBinaryTree.Entry<>(key,value));    //保存节点
        if (this.root == null){    //没有根节点，则这个节点作为根节点
            this.root = newNode;
        }else{    //需要为其保存到一个合适的节点
            this.root.addNode(newNode);      //交由Node类负责处理  【从根节点添加】
        }
        this.count++;
    }

    /**
     * 查询数据
     * 现在的检索主要是依靠Comparable实现的数据的比较
     * @param key    要比较的数据
     * @return    查找到数据返回true，否则返回false
     */
    public boolean contains(K key){
        if (this.count ==0 ){    //表示没有数据
            return false;
        }
        return this.root.containsNode(new MapBinaryTree.Entry<>(key,null));   //交给Node类完成  【从根节点开始查询】
    }


    /**
     * 以对象数组的形式返回全部数据，如果没有数据，返回null
     * @return
     */
    public Object[] toArray(){
        if (this.count == 0){
            return null;
        }
        this.returnData = new Object[count];    //保存长度为数组长度
        this.foot = 0;    //脚标清零
        this.root.toArrayNode();    //数据通过Node类处理成数组的形式。【从根节点开始】
        return this.returnData;    //返回全部的数据。
    }

    /**
     * 根据指定的key获取对应的value数据
     * @param key  要查询的key
     * @return  有数据则返回内容,没有则返回空
     */
    public V get(K key){
        if (this.count ==0 || key == null){
            return null;
        }
        return this.root.getNode(key);
    }

}
