package jzOffer;

public class BalancedBinaryTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        return getDepth(root)!=-1;
    }

    public int getDepth(TreeNode root) {
        if(root==null)    return 0;
        int left=getDepth(root.left);
        if(left==-1)    return -1;
        int right=getDepth(root.right);
        if(right==-1)    return -1;
        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
    }

    /*
    //自己开始想的方法，但是一定要把树给遍历完才行；上面的方法实现了剪枝
    boolean isBalanced=true;
    public boolean IsBalanced_Solution(TreeNode root) {
        TreeDepth(root);
        return isBalanced;
    }

    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        if(left-right>1 || right-left>1)
            isBalanced=false;
        return Math.max(left+1,right+1);
    }
    */
}