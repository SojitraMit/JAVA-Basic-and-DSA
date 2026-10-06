import java.util.Scanner;

public class Problems {

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

    public static int count(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int count=1;

        for(int i=0;i<root.children.size();i++){
            count +=count(root.children.get(i));
        }

        return count;
    }

    public static int LargestNode(TreeNode<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE;
        }

        int max=root.data;
        for(int i=0;i<root.children.size();i++){
            int childValue=LargestNode(root.children.get(i));

            if(childValue>max){
                max=childValue;
            }
        }

        return max;
    }

    public static int height(TreeNode<Integer> root){
        if(root==null) {
            return 0;
        }
        int maxHeight = 0;
        for(int i=0;i<root.children.size();i++) {
            int max = height(root.children.get(i));
            if(maxHeight< max ) {
                maxHeight = max;
            }
        }
        return maxHeight + 1;
    }

    public static void printAtK(TreeNode<Integer> root , int k){
        if(k<0){
            return;
        }

        if(k==0){
            System.out.println(root.data);
        }
        for(int i=0;i<root.children.size();i++){
            printAtK(root.children.get(i),k-1);
        }

        return;
    }

    public static int countLeafNodes(TreeNode<Integer> root) {
        if(root==null) {
            return 0;
        }
        if(root.children.size()==0) {
            return 1;
        }
        int sum=0;
        for(int i=0;i<root.children.size();i++) {
            sum+=countLeafNodes(root.children.get(i));
        }
        return sum;
    }

    public static void PreOrder(TreeNode<Integer> root){
        if(root==null){
            return ;
        }

        System.out.print(root.data+" ");
        for(int i=0;i<root.children.size();i++){
            PreOrder(root.children.get(i));
        }
    }

    public static void PostOrder(TreeNode<Integer> root){
        if(root==null){
            return ;
        }


        for(int i=0;i<root.children.size();i++){
            PreOrder(root.children.get(i));
        }
        System.out.print(root.data+" ");
    }

    public static int SumOfNodes(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int sum=root.data;
        for(int i=0;i<root.children.size();i++){
            sum +=SumOfNodes(root.children.get(i));
        }

        return sum;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root=takeInput();
        //System.out.println("Total nodes= "+countLeafNodes(root));
//        PreOrder(root);
//        System.out.println();
//        PostOrder(root);
        System.out.println(SumOfNodes(root));
    }
}
