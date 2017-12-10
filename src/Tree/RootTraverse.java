package Tree;

/**
 * 遍历的递归调用
 */
public class RootTraverse {
    /**
     * 先根遍历
     *
     * @param T 节点
     */
    public void preRootTraverse(BiTreeNode T) {
        if (T != null) {
            System.out.println(T.data);//输出数据域
            preRootTraverse(T.lChild);//先根遍历左子树
            preRootTraverse(T.rChild);//先根遍历右子树
        }
    }
}
