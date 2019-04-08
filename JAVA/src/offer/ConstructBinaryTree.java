package offer;

public class ConstructBinaryTree {
    class TreeNode {
        int val;

        public TreeNode(int val) {
            this.val = val;
        }

        TreeNode left;
        TreeNode right;
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length <= 0 || in.length <= 0 || pre.length != in.length) {
            throw new RuntimeException("数组不符合规范！");
        }
        return construct(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    /**
     *
     * @Description 由前序遍历序列和中序遍历序列得到根结点
     * pre、in：始终用最初的前序遍历和中序遍历数组代入
     * pStart、pEnd：当前树的前序数组开始和结束位置
     * iStart、iEnd：中序数组开始和结束位置
     */
    public TreeNode construct(int[] pre, int[] in, int pStart, int pEnd, int iStart, int iEnd) {
        TreeNode root = new TreeNode(pre[pStart]);
        if (pStart == pEnd && iStart == iEnd) {
            if (pre[pStart] != in[iStart])
                throw new RuntimeException("数组不符合规范！");
            return root;
        }
        int index = iStart; // 用于记录中序遍历序列中根结点的位置
        while (root.val != in[index] && index <= iEnd) {
            index++;
        }
        if (index > iEnd)
            throw new RuntimeException("数组不符合规范！");
        int leftLength = index - iStart;
        if (leftLength > 0) {
            root.left = construct(pre, in, pStart + 1, pStart + leftLength, iStart, index - 1);
        }
        if (leftLength < iEnd - iStart) {
            root.right = construct(pre, in, pStart + leftLength + 1, pEnd, index + 1, iEnd);
        }
        return root;
    }

    private void preOrderTraverse(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.val);
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    private void inOrderTraverse(TreeNode node) {
        if (node == null)
            return;
        inOrderTraverse(node.left);
        System.out.print(node.val);
        inOrderTraverse(node.right);
    }

    public static void main(String[] args) {
        ConstructBinaryTree demo = new ConstructBinaryTree();
    }
}