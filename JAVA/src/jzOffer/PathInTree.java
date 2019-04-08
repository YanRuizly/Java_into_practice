package jzOffer;

//题目：输入一棵二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所
//有路径。从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。

import java.util.ArrayList;

public class PathInTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public void findPath(TreeNode root, int target) {
        if (root == null)
            return;
        ArrayList<Integer> list = new ArrayList<>();
        printPath(root, target, list);
    }

    private void printPath(TreeNode node, int target, ArrayList<Integer> list) {
        if (node == null)
            return;
        list.add(node.val);
        target -= node.val;  //每个结点的target不会受到方法的影响而改变
        if (target == 0 && node.left == null && node.right == null) {  //叶子结点
            for (Integer integer : list)
                System.out.print(integer + " ");
            System.out.println();
        } else {     //中间结点
            printPath(node.left, target, list);
            printPath(node.right, target, list);
        }
        list.remove(list.size() - 1);
    }
}