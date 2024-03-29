package DataStructure.tree;

/**
 * @Auther: AJun
 * @version:1.0
 * @Date: 2020/08/29  23:00
 * @Description: 顺序存储二叉树 （数组和树互换）
 *          特点：
 *              顺序二叉树通常只考虑完全二叉树
 *              第n个元素的左子节点为 2*n+1    （n从0开始编号）
 *              第n个元素的右子节点为 2*n+2
 *              第n个元素的符父节点为 （n-1）/2
 *
 **/
public class ArrBinaryTree {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        //创建一个 ArrBinaryTree
        ArrBinaryTree arrBinaryTree = new ArrBinaryTree(arr);
        arrBinaryTree.preOrder(); // 1,2,4,5,3,6,7
        System.out.println();
        arrBinaryTree.infixOrder(); // 4,2,5,1,6,3,7
        System.out.println();
        arrBinaryTree.postOrder(); // 4,5,2,6,7,3,1
    }

    private int[] arr;//存储数据结点的数组

    public ArrBinaryTree(int[] arr) {
        this.arr = arr;
    }

    //重载preOrder
    public void preOrder() {
        this.preOrder(0);
    }
    //重载preOrder
    public void infixOrder() {
        this.infixOrder(0);
    }
    //重载preOrder
    public void postOrder() {
        this.postOrder(0);
    }

    /**
     *顺序存储二叉树的前序遍历
     * @param index 数组的下标
     */
    public void preOrder(int index) {
        //如果数组为空，或者 arr.length = 0
        if(arr == null || arr.length == 0) {
            System.out.println("数组为空，不能按照二叉树的前序遍历");
        }
        //输出当前这个元素
        System.out.print(arr[index]);
        //向左递归遍历
        if((index * 2 + 1) < arr.length) {
            preOrder(2 * index + 1 );
        }
        //向右递归遍历
        if((index * 2 + 2) < arr.length) {
            preOrder(2 * index + 2);
        }
    }
    /**
     *顺序存储二叉树的中序遍历
     * @param index 数组的下标
     */
    public void infixOrder(int index) {

        if(arr == null || arr.length == 0) {
            System.out.println("数组为空，不能按照二叉树的中序遍历");
        }

        //向左递归遍历
        if((index * 2 + 1) < arr.length) {
            infixOrder(2 * index + 1 );
        }
        System.out.print(arr[index]);
        //向右递归遍历
        if((index * 2 + 2) < arr.length) {
            infixOrder(2 * index + 2);
        }
    }
    /**
     *顺序存储二叉树的后序遍历
     * @param index 数组的下标
     */
    public void postOrder(int index) {
        //如果数组为空，或者 arr.length = 0
        if(arr == null || arr.length == 0) {
            System.out.println("数组为空，不能按照二叉树的后序遍历");
        }
        //向左递归遍历
        if((index * 2 + 1) < arr.length) {
            postOrder(2 * index + 1 );
        }
        //向右递归遍历
        if((index * 2 + 2) < arr.length) {
            postOrder(2 * index + 2);
        }
        System.out.print(arr[index]);
    }
}
