import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInput {

    public static TreeNode<Integer> takeInput()  {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData=s.nextInt();
        TreeNode<Integer> root=new TreeNode<>(rootData);

        QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
        pendingNodes.enqueue(root);

        while (!pendingNodes.isEmpty()){

            try {
                TreeNode<Integer> frontNode= pendingNodes.dequeue();
                System.out.println("Enter num of children of "+frontNode.data);
                int numChildren=s.nextInt();

                for(int i=0;i<numChildren;i++){
                    System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
                    int child=s.nextInt();
                    TreeNode<Integer> childNode=new TreeNode<>(child);
                    frontNode.children.add(childNode);
                    pendingNodes.enqueue(childNode);
                }
            } catch (QueueEmptyException e) {
                //shouldn't come here
                return null;
            }

        }

        return root;
    }

    public static void printLevelWise(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            TreeNode<Integer> frontNode = queue.poll();
            if (frontNode == null) {
                System.out.println();
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                System.out.print(frontNode.data + " ");
                for (int i = 0; i < frontNode.children.size(); i++) {
//					System.out.print(frontNode.children.get(i).data+",");
                    queue.add(frontNode.children.get(i));
                }
            }
        }
    }

    public static void main(String[] args){
        TreeNode<Integer> root=takeInput();
        printLevelWise(root);
    }

}


