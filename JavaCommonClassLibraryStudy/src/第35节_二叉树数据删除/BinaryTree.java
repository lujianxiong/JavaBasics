package 第35节_二叉树数据删除;

//实现二叉树的操作
//<T>要进行二叉树的实现
public class BinaryTree<T extends Comparable> {

    private class Node {    //内部类定义Node节点
        private Comparable<T> data;    //保存节点的数据             使用Comparable,可以比较大小
        private Node parent;    //保存父节点
        private Node left;    //保存左子树
        private Node right;    //保存右子树

        public Node(Comparable<T> data) {    //构造方法直接存储数据
            this.data = data;
        }

        /**
         * 实现节点数据的适当位置的存储
         *
         * @param newNode //创建的新节点。
         */
        public void addNode(Node newNode) {
            if (newNode.data.compareTo((T) this.data) <= 0) {   //如果新增节点的数据小于当前节点的数据，将数据放到左子树
                if (this.left == null) {    //左子树为空
                    this.left = newNode;    //将新增节点保存为左子树
                    newNode.parent = this;    //将当前节点保存为父节点
                } else {    //否则将新增节点继续向左进行判断
                    this.left.addNode(newNode);    //递归调用，继续向下判断
                }
            } else {     //比当前节点数据要大，存到右边
                if (this.right == null) {    //右子树为空
                    this.right = newNode;    //新增节点存到右子树
                    newNode.parent = this;
                } else {    //否则将新增节点继续向下判断
                    this.right.addNode(newNode);
                }

            }
        }

        /**
         * 获取全部数据的具体实现，按照中序遍历的形式完成（中序遍历出来是有序的）
         */
        public void toArrayNode() {    //中序遍历：左、中、右
            if (this.left != null) {    //有左子树
                this.left.toArrayNode();    //递归调用
            }
            returnData[foot++] = this.data;   //将数据存到对象数组中

            if (this.right != null) {   //有右子树
                this.right.toArrayNode();  //递归调用
            }
        }

        /**
         * 进行数据的检索处理
         *
         * @param data 检索的数据
         * @return 找到返回true，找不到返回false
         */
        public boolean containsNode(Comparable<T> data) {
            if (data.compareTo((T) this.data) == 0) {    //要查询的数据就是根节点
                return true;
            } else if (data.compareTo((T) this.data) < 0) {
                if (this.left != null) {
                    return this.left.containsNode(data);    //对左子树进行递归调用
                } else {
                    return false;
                }
            } else {
                if (this.right != null) {
                    return this.right.containsNode(data);
                } else {
                    return false;
                }
            }
        }

        /**
         * 获取要删除的节点对象
         * @param data  当前节点数据
         * @return  返回要删除的节点对象
         */
        public Node getRemoveNode(Comparable<T> data){
            if (data.compareTo((T) this.data) == 0) {
                return this;
            } else if (data.compareTo((T) this.data) < 0) {
                if (this.left != null) {
                    return this.left.getRemoveNode(data);
                } else {
                    return null;
                }
            } else {
                if (this.right != null) {
                    return this.right.getRemoveNode(data);
                } else {
                    return null;
                }
            }
        }

    }

        //----------------------------以下为二叉树的功能实现--------------------------------
        private Node root;    //保存的是根节点
        private int count = 0;    //保存数据的个数
        private Object[] returnData;    //返回的数据
        private int foot = 0;    //脚标控制

        /**
         * 数据的保存
         *
         * @param data 要保存的数据内容
         * @Exception NullPointerException 保存数据为空时抛出的异常
         */
        public void add(Comparable<T> data) {
            if (data == null) {   //数据为空，抛异常
                throw new NullPointerException("保存的数据不允许为空");
            }
            //所有的数据本身不具备有节点关系的匹配，那么一定要将其包装在Node类之中。
            Node newNode = new Node(data);    //保存节点
            if (this.root == null) {    //没有根节点，则这个节点作为根节点
                this.root = newNode;
            } else {    //需要为其保存到一个合适的节点
                this.root.addNode(newNode);      //交由Node类负责处理  【从根节点添加】
            }
            this.count++;
        }

        /**
         * 查询数据
         * 现在的检索主要是依靠Comparable实现的数据的比较
         *
         * @param data 要比较的数据
         * @return 查找到数据返回true，否则返回false
         */
        public boolean contains(Comparable<T> data) {
            if (this.count == 0) {    //表示没有数据
                return false;
            }
            return this.root.containsNode(data);   //交给Node类完成  【从根节点开始查询】
        }


        /**
         * 以对象数组的形式返回全部数据，如果没有数据，返回null
         *
         * @return
         */
        public Object[] toArray() {
            if (this.count == 0) {
                return null;
            }
            this.returnData = new Object[count];    //保存长度为数组长度
            this.foot = 0;    //脚标清零
            this.root.toArrayNode();    //数据通过Node类处理成数组的形式。【从根节点开始】
            return this.returnData;    //返回全部的数据。
        }

    /**
     * 执行程序的删除处理
     * @param data   要删除的数据
     */
    public void remove(Comparable<T> data) {
        if (this.root ==null){    //根节点不存在
            return;    //结束调用，不玩了
        }else {
            if (this.root.data.compareTo((T)data) == 0){   //删除的是根节点
                Node moveNode = root.right;   //移动的节点
                while (moveNode.left != null){    //现在该节点左边还有节点
                    moveNode = moveNode.left;   //一直向左找
                }    //可以确定删除节点的右子节点的最小的左节点
                moveNode.left = root.left;
                moveNode.right = root.right;
                moveNode.parent.left = null;
                root = moveNode;   //改变根节点

            }else{
                //找到要删除的节点
                Node removeNode = this.root.getRemoveNode(data);  //Node类负责具体实现
                if (removeNode != null){   //找到要删除的对象信息了

                    if (removeNode.left == null && removeNode.right ==null){   //情况一:没有任何的字节点
                        removeNode.parent.left = null;
                        removeNode.parent.right = null;
                        removeNode.parent = null;   //父节点直接断开引用
                    }else if (removeNode.left != null && removeNode.right == null) {  //情况二：左边不为空
                        removeNode.parent.left = removeNode.left;
                        removeNode.left.parent = removeNode.parent;   //要删除节点的父节点做要删除的左节点的父节点
                    }else if (removeNode.left == null && removeNode.right != null){   //情况二：右边不为空
                        removeNode.parent.left = removeNode.right;
                        removeNode.right.parent = removeNode.parent;
                    }else{    //情况三：两边都有节点;  则将右边节点中最左边的节点找到，改变其引用
                        Node moveNode = removeNode.right;   //移动的节点
                        while (moveNode.left != null){    //现在该节点左边还有节点
                            moveNode = moveNode.left;   //一直向左找
                        }    //可以确定删除节点的右子节点的最小的左节点
                        removeNode.parent.left = moveNode;
                        moveNode.parent.left = null;    //断开原本的连接
                        moveNode.parent = removeNode.parent;    //改变被删除的节点处的引用
                        moveNode.right = removeNode.right;    //改变被删除的节点的右节点指向
                        moveNode.left = removeNode.left;
                    }
                }
            }
        }
        this.count--; //数量-1
    }

}
