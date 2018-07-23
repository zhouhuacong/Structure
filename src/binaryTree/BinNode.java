package binaryTree;

public class BinNode {
    private Object element;
    private BinNode lChild;// 定义指向左子树的指针
    private BinNode rChild;// 定义指向右子树的指针

    public BinNode(Object element, BinNode lChild, BinNode rChild) {
        this.element = element;
        this.lChild = lChild;
        this.rChild = rChild;
    }
}
