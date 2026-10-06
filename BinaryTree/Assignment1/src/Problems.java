import java.util.*;

public class Problems {

    public static BinaryTreeNode<Integer> takeInput(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter root node data ");
        int rootData=s.nextInt();

        if(rootData==-1){
            return null;
        }

        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
        pendingNodes.enqueue(root);

        while (!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> frontNode;
            try {
                frontNode=pendingNodes.dequeue();
            } catch (QueueEmptyException e) {
                return null;
            }

            System.out.println("Enter left child of "+frontNode.data);
            int leftData=s.nextInt();
            if(leftData != -1){
                BinaryTreeNode<Integer> leftNode=new BinaryTreeNode<>(leftData);
                frontNode.left=leftNode;
                pendingNodes.enqueue(leftNode);
            }

            System.out.println("Enter right child of "+frontNode.data);
            int rightData=s.nextInt();
            if(rightData != -1){
                BinaryTreeNode<Integer> rightNode=new BinaryTreeNode<>(rightData);
                frontNode.right=rightNode;
                pendingNodes.enqueue(rightNode);
            }
        }

        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root){

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        //		queue.add(null);
        while(!queue.isEmpty()) {

            BinaryTreeNode<Integer> frontNode = queue.poll();

            //			if(frontNode==null) {
            //				System.out.println();
            //				if(!queue.isEmpty()) {
            //					queue.add(null);
            //				}
            //			}
            //			else {
            System.out.print(frontNode.data+"-");
            if(frontNode.left!=null) {
                System.out.print("L:"+frontNode.left.data+",");
                queue.add(frontNode.left);
            }
            else {
                System.out.print("L:"+-1+",");
            }
            if(frontNode.right!=null) {
                System.out.print("R:"+frontNode.right.data);
                queue.add(frontNode.right);
            }
            else {
                System.out.print("R:"+-1);
            }
            System.out.println();
            //			}

        }
    }

    public static int SumOfAllNodes(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int sum= root.data;

        sum += SumOfAllNodes(root.left);
        sum += SumOfAllNodes(root.right);

        return sum;
    }

    public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();


        ArrayList<Integer> a=new ArrayList<>();
        

        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return 1+ Math.max(leftHeight,rightHeight);
    }

    // Binary tree if balanced if balance factor is between -1 to 1;
    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root==null){
            return true;
        }

        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        if(leftHeight-rightHeight > 1 || leftHeight-rightHeight < -1  ){
            return false;
        }

        isBalanced(root.left);
        isBalanced(root.right);

        return true;


    }

    public static void printLevelWise1(BinaryTreeNode<Integer> root){

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()) {

            BinaryTreeNode<Integer> frontNode = queue.poll();
            if(frontNode==null) {
                System.out.println();
                if(!queue.isEmpty()) {
                    queue.add(null);
                }
            }
            else {
                System.out.print(frontNode.data+" ");
                if(frontNode.left!=null) {
                    queue.add(frontNode.left);
                }
                if(frontNode.right!=null) {
                    queue.add(frontNode.right);
                }
            }

        }

    }

    public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){

        // Write your code here
        if(root==null) {
            return root;
        }

        if(root.left==null && root.right ==null) {
            return null;
        }

        root.left = removeAllLeaves(root.left);
        root.right = removeAllLeaves(root.right);

        return root;

    }

    public static void printZigZag(BinaryTreeNode<Integer> root) {

        Stack<BinaryTreeNode<Integer>> stack1  = new Stack<>();
        Stack<BinaryTreeNode<Integer>> stack2 = new Stack<>();

        stack1.push(root);

        while( !(stack1.isEmpty() && stack2.isEmpty()) ) {
            while(!stack1.isEmpty()) {
                BinaryTreeNode<Integer> frontNode = stack1.pop();
                System.out.print(frontNode.data+" ");
                if(frontNode.left!=null) {
                    stack2.push(frontNode.left);
                }
                if(frontNode.right!=null) {
                    stack2.push(frontNode.right);
                }
            }
            System.out.println();
            while(!stack2.isEmpty()) {
                BinaryTreeNode<Integer> frontNode = stack2.pop();
                System.out.print(frontNode.data+" ");
                if(frontNode.right!=null) {
                    stack1.push(frontNode.right);
                }
                if(frontNode.left!=null) {
                    stack1.push(frontNode.left);
                }
            }
            System.out.println();
        }

    }

    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {

        if(root==null) {
            return ;
        }

        if(root.left!=null && root.right ==null) {
            System.out.println(root.left.data);
        }
        if(root.left==null && root.right !=null) {
            System.out.println(root.right.data);
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);


    }

    public static int LcaOfBinaryTree(BinaryTreeNode<Integer> root,int a,int b){
        if(root==null){
            return -1;
        }
        if(root.data==a || root.data==b){
            return root.data;
        }

        int leftLca = LcaOfBinaryTree(root.left, a, b);
        int rightLca = LcaOfBinaryTree(root.right, a, b);
        if(leftLca==-1 && rightLca ==-1) {
            return -1;
        }
        else if(leftLca==-1) {
            return rightLca;
        }
        else if(rightLca==-1) {
            return leftLca;
        }
        else {
            return root.data;
        }
    }

    public static void PairSum(BinaryTreeNode<Integer> root,int s){
        if(root==null){
            return;
        }


    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=takeInput();
        printLevelWise1(removeAllLeaves(root));
    }
}
