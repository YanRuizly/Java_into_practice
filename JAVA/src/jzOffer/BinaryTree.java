package jzOffer;

class Node{

    String data;
    private Node lchild;
    private Node rchild;
    Node(String data){
        this.data = data;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Node getLchild() {
        return lchild;
    }
    public void setLchild(Node lchild) {
        this.lchild = lchild;
    }
    public Node getRchild() {
        return rchild;
    }
    public void setRchild(Node rchild) {
        this.rchild = rchild;
    }
}



public class BinaryTree {

    private static Node root;
    private static String [] treeNodes;
    static int index;

    public BinaryTree(String tree) {
        root = new Node("");
        treeNodes = tree.split(",");
        index = 0;
        createTree(root);
    }
    /**
     * 先序创建
     */
    public static Node createTree(Node node) {

        String data = treeNodes[index];
        System.out.println("index "+index+" data "+data);
        index++;

        if(data.equals("#")){
            return null;
        }
        else {
            //node.setData(data);//并没有将Node赋值过去 是因为java传的是值
            //new 之后地址不再是原来的了
            node.setData(data);;
            node.setLchild(createTree(new Node("")));
            node.setRchild(createTree(new Node("")));
            return node;
        }

    }

    public Node getRoot() {
        return root;
    }
}
