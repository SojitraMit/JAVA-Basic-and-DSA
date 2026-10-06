import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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

    public static int countNode(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int count =1;

        count += countNode(root.left);
        count += countNode(root.right);

        return count;
    }

    public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return 1+ Math.max(leftHeight,rightHeight);
    }

    public static int Diameter(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int option1=height(root.left) + height(root.right);
        int option2=Diameter(root.left);
        int option3=Diameter(root.right);

        return Math.max(option1,Math.max(option2,option3));

    }

    public static Pair<Integer,Integer> HeightDiameterOfBT(BinaryTreeNode<Integer> root){

        if(root ==null) {
            Pair<Integer,Integer> pair = new Pair<>();
            pair.first = 0;
            pair.second = 0;
            return pair;
        }

        Pair<Integer,Integer> leftPair = HeightDiameterOfBT(root.left);
        Pair<Integer,Integer> rightPair = HeightDiameterOfBT(root.right);

        int height = 1 + Math.max(leftPair.first, rightPair.first);

        int option1 = leftPair.first  + rightPair.first;
        int option2 = leftPair.second;
        int option3 = rightPair.second;

        int diameter=Math.max(option1,Math.max(option2,option3));

        Pair<Integer,Integer> ansPair = new Pair<>();
        ansPair.first = height;
        ansPair.second = diameter;
        return ansPair;

    }

    public static void inOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);

    }

    public static void preOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.println(root.data);

        preOrder(root.left);
        preOrder(root.right);

    }

    public static void postOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);

        System.out.println(root.data);
    }

    public static BinaryTreeNode<Integer> BuildTreeUsingInPre(int in[] , int pre[]){
        return BuildTreeHelper1(in , pre , 0 , in.length-1 , 0 , pre.length-1 );
    }

    public static BinaryTreeNode<Integer> BuildTreeHelper1(int in[],int pre[],int inS,int inE,int preS,int preE){
        if(inS>inE){
            return null;
        }

        int rootData=pre[preS];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);

        int rootInIndex=-1;
        for(int i=inS;i<=inE;i++){
            if(in[i]==rootData){
                rootInIndex=i;
                break;
            }
        }
        if(rootInIndex==-1){
            return null;
        }

        int leftInS= inS;
        int leftInE= rootInIndex - 1;
        int leftPreS= preS + 1;
        int leftPreE=leftInE - leftInS + leftPreS;
        int rightInS= rootInIndex+1;
        int rightInE= inE;
        int rightPreS= leftPreE+1;
        int rightPreE=preE;

        root.left=BuildTreeHelper1(in,pre,leftInS,leftInE,leftPreS,leftPreE);
        root.right=BuildTreeHelper1(in,pre,rightInS,rightInE,rightPreS,rightPreE);

        return root;
    }

    public static BinaryTreeNode<Integer> BuildTreeUsingInPost(int in[] , int post[]){
        return BuildTreeHelper2(in , post , 0 , in.length-1 , 0 , post.length-1 );
    }

    public static BinaryTreeNode<Integer> BuildTreeHelper2(int in[],int post[],int inS,int inE,int postS,int postE){
        if(inS>inE){
            return null;
        }

        int rootData=post[postE];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);

        int rootInIndex=-1;
        for(int i=inS;i<=inE;i++){
            if(in[i]==rootData){
                rootInIndex=i;
                break;
            }
        }
        if(rootInIndex==-1){
            return null;
        }

        int leftInS= inS;
        int leftInE= rootInIndex - 1;
        int leftPostS= postS ;
        int leftPostE=leftInE - leftInS + leftPostS;
        int rightInS= rootInIndex+1;
        int rightInE= inE;
        int rightPostS= leftPostE+1;
        int rightPostE=postE-1;

        root.left=BuildTreeHelper2(in,post,leftInS,leftInE,leftPostS,leftPostE);
        root.right=BuildTreeHelper2(in,post,rightInS,rightInE,rightPostS,rightPostE);

        return root;
    }

    public static boolean isNodePresent(BinaryTreeNode<Integer> root,int X){
        if(root==null){
            return false;
        }

        if(root.data==X){
            return true;
        }

        if(isNodePresent(root.left,X)){
            return true;
        }
        if(isNodePresent(root.right,X)){
            return true;
        }

        return false;
    }

    public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root,int data){
        if(root==null){
            return null;
        }

        if(root.data==data){
            ArrayList<Integer> output=new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> leftOutput=getRootToNodePath(root.left,data);
        if(leftOutput != null){
            leftOutput.add(root.data);
            return leftOutput;
        }

        ArrayList<Integer> rightOutput=getRootToNodePath(root.right,data);
        if(rightOutput != null){
            rightOutput.add(root.data);
            return rightOutput;
        }
        else {
            return null;
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=takeInput();
//        printLevelWise(root);
//        System.out.println(countNode(root));

//        int in[]={4 ,8 ,2, 5, 1, 6, 3 ,7};
//        int post[]={8 ,4, 5 ,2, 6, 7 ,3 ,1};
//        BinaryTreeNode<Integer> root=BuildTreeUsingInPost(in,post);
//        printLevelWise(root);
        System.out.println(isNodePresent(root,2));

    }
}
