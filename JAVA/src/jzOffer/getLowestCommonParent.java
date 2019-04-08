//package jzOffer;
//
//public class getLowestCommonParent {
//    /*
// * 二叉搜索树
// * 利用大小关系即可
// */
//    public static TreeNode getLastCommonNode(TreeNode pRoot, TreeNode pLeft, TreeNode pRight){
//        TreeNode treeNode = null;
//        if(pRoot == null || pLeft.val > pRight.val){
//            return null;
//        }
//        if(pRoot.val >= pRight.val){
//            treeNode = getLastCommonNode(pRoot.left, pLeft, pRight);
//        }
//        if(pRoot.val <= pLeft.val){
//            treeNode = getLastCommonNode(pRoot.right, pLeft, pRight);
//        }
//        if(pRoot.val >= pLeft.val && pRoot.val <= pRight.val){
//            return pRoot;
//        }
//        return treeNode;
//    }
//
//
//    /*
//     * 普通二叉树
//     * 将下面结点的信息利用递归s往上传递
//     */
//    public TreeNode getLowestCommonParent(TreeNode root,TreeNode node1,TreeNode node2) {
//        if(root==null || root== node1 || root== node2)
//            return root;
//        TreeNode left=getLowestCommonParent(root.left, node1, node2);
//        TreeNode right=getLowestCommonParent(root.right, node1, node2);
//        return left==null? right:right==null? left:root;
////  上面这句代码就是：
////  if(left==null) {
////          return right;
////  }else {
////      if(right==null)
////          return left;
////      else
////          return root;
////  }
//    }
//}
