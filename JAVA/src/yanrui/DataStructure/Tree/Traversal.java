package yanrui.DataStructure.Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Traversal {
    public static void PriOrderTr(TreeNode root){
        if (root == null)
            return;
        System.out.println(root.val);
        PriOrderTr(root.left);
        PriOrderTr(root.right);
    }

    //非递归的中序遍历
    public static void InOrderTr(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        if(root == null)
            return;
        TreeNode node = root;
        while (!stack.isEmpty() || node  != null){
            while (node.left != null){
                stack.add(node);
                node = node.left;
            }
            if(!stack.isEmpty()){
                node = stack.pop();
                System.out.println(node.val);
                if(node.right!=null){
                    node = node.right;
                }
            }
        }
    }

    public static void LevelTr(TreeNode root){
        Deque<TreeNode> deque = new LinkedList<>();  // 双向的队列
        if(root == null)
            return;
        TreeNode node = root;
        deque.add(node);
        int cur = 0;
        int sum = 1;
        while (!deque.isEmpty()){  //队列中元素不为空
            TreeNode temp = deque.peek();
            System.out.println(temp.val);
            cur++;
            deque.removeFirst();
            if(temp.left != null)
                deque.addLast(temp.left);
            if(temp.right != null)
                deque.addLast(temp.right);
            if(cur == sum){
                System.out.println("...");
                cur = 0; //又从0开始计数
                sum = deque.size();//1  2
            }
        }
    }


    public static void main(String[] args){
        TreeNode node3 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node10 = new TreeNode(10);
        TreeNode node7= new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node15 = new TreeNode(15);
        node3.left = node5;
        node3.right = node10;
        node5.left = node7;
        node5.right = node9;
        node10.left = node15;
        System.out.println("先序");
        PriOrderTr(node3);
        System.out.println("层序");
        LevelTr(node3);
    }
}
