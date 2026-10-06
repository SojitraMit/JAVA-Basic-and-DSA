public class BST {
    private BinaryTreeNode<Integer> root;

    public void insertData(int data) {
        root = insert(root,data);
    }
    public BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root,int data) {
        if(root==null) {
            BinaryTreeNode<Integer> newNode =  new BinaryTreeNode<Integer>(data);
            return newNode;
        }
        if(data < root.data) {
            root.left = insert(root.left, data);
        }
        else {
            root.right = insert(root.right,data);
        }
        return root;
    }

    public boolean hasData(int data){
        return hasDataHelper(data,root);
    }

    private boolean hasDataHelper(int data,BinaryTreeNode<Integer> root){
        if(root==null){
            return false;
        }

        if(root.data==data){
            return true;
        } else if (data<root.data) {
            return hasDataHelper(data,root.left);
        }else {
            return hasDataHelper(data,root.right);
        }
    }

    public void deleteData(int data){
        root=delete(root,data);
    }

    private BinaryTreeNode<Integer> delete(BinaryTreeNode<Integer> root,int data){
        if(root==null){
            return null;
        }

        if (data< root.data) {
            root.left=delete(root.left,data);
            return root;
        }
        else if(data > root.data) {
            root.right=delete(root.right,data);
            return root;
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if (root.left==null) {
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else {
                BinaryTreeNode<Integer> minNode=root.right;
                while (minNode.left != null){
                    minNode=minNode.left;
                }
                root.data=minNode.data;
                root.right=delete(root.right,minNode.data);
                return root;
            }
        }
    }

    public void printTree(){
        printTree(root);
    }

    private void printTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }

        String toBePrinted=root.data+"-";
        if(root.left != null){
            toBePrinted += "L:"+root.left.data+" ";
        }
        if(root.right != null){
            toBePrinted += "R:"+root.right.data+" ";
        }

        System.out.println(toBePrinted);

        printTree(root.left);
        printTree(root.right);
    }
}
