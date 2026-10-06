import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelWise {

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


    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=takeInput();
        printLevelWise(root);
    }
}
