import java.util.Scanner;

public class Questions {
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

    public static boolean FindNum(TreeNode<Integer> root,int X) {
        if(root==null){
            return false;
        }

        if(root.data==X){
            return true;
        }
        for(int i=0;i<root.children.size();i++){
            if(FindNum(root.children.get(i),X)){
                return true;
            }
        }

        return false;
    }

    public static int numNodeGrater(TreeNode<Integer> root,int X){
        if(root==null){
            return 0;
        }

        int count =0;


        for(int i=0;i<root.children.size();i++) {
            count += numNodeGrater(root.children.get(i),X);
        }

        if(root.data>X){
            return count+1;
        }
        
        return count;
    }

    //check two trees same or not
    public static boolean CompareTree(TreeNode<Integer> root1,TreeNode<Integer> root2){
        if(root1.data != root2.data || root1.children.size() != root2.children.size()){
            return false;
        }

        for(int i=0;i<root1.children.size();i++){
            if(!CompareTree(root1.children.get(i),root2.children.get(i))){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root=takeInput();
        TreeNode<Integer> root2=takeInput();
        System.out.println(CompareTree(root,root2));
    }
}
