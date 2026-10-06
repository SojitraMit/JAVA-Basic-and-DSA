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

    public static BinaryTreeNode<Integer> Search(BinaryTreeNode<Integer> root,int x){
        if(root==null){
            return null;
        }

        if(root.data==x){
            return root;
        }

        if(x>root.data){
            return Search(root.right,x);
        }
        else {
            return Search(root.left,x);
        }

    }

    public static int minimum(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MAX_VALUE;
        }

        return Math.min(root.data, Math.min(minimum(root.left),minimum(root.right)));
    }

    public static int maximum(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE;
        }

        return Math.max(root.data, Math.max(maximum(root.left),maximum(root.right)));
    }

    public static boolean isBST(BinaryTreeNode<Integer> root){
        if(root==null){
            return true;
        }

        int leftMax=maximum(root.left);
        int rightMin=minimum(root.right);

        if(leftMax>= root.data){
            return false;
        }
        if(rightMin< root.data){
            return false;
        }

        if(!isBST(root.left) || !isBST(root.right)){
            return false;
        }

        return true;
    }

    public static Pair<Boolean,Pair<Integer,Integer>> isBST2(BinaryTreeNode<Integer> root){
        if(root==null){
            Pair<Boolean,Pair<Integer,Integer>> Output=new Pair<Boolean, Pair<Integer, Integer>>();
            Output.first=true;
            Output.second=new Pair<>();
            Output.second.first=Integer.MAX_VALUE;
            Output.second.second=Integer.MIN_VALUE;

            return Output;
        }

        Pair<Boolean,Pair<Integer,Integer>> leftOutput=isBST2(root.left);
        Pair<Boolean,Pair<Integer,Integer>> rightOutput=isBST2(root.right);

        int min=Math.min(root.data,Math.min(leftOutput.second.first,rightOutput.second.first));
        int max=Math.max(root.data,Math.max(leftOutput.second.second,rightOutput.second.second));

        boolean isBST=(root.data > leftOutput.second.second) && (root.data <= rightOutput.second.first)
                && leftOutput.first && rightOutput.first;

        Pair<Boolean,Pair<Integer,Integer>> Output=new Pair<>();
        Output.first=isBST;
        Output.second=new Pair<>();
        Output.second.first=min;
        Output.second.second=max;

        return Output;
    }


    public static boolean isBST3(BinaryTreeNode<Integer> root,int min,int max){
        if(root==null){
            return true;
        }

        if(root.data>max || root.data<min){
            return false;
        }

        boolean isLeftOk=isBST3(root.left,min, root.data-1);
        boolean isRightOk=isBST3(root.right, root.data, max);

        return isRightOk && isLeftOk;
    }

    public static void printNodeFromK1ToK2(BinaryTreeNode<Integer> root,int k1,int k2){

        if(root==null)
            return ;
        if(k1< root.data ) {
            printNodeFromK1ToK2(root.left, k1, k2);
        }
        if(root.data >=k1 && root.data <=k2) {
            System.out.print(root.data+" ");
        }

        if(k2>root.data) {
            printNodeFromK1ToK2(root.right, k1, k2);
        }

    }

    public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        if(root==null) {
            return new ArrayList<Integer>();
        }
        if( root.data == data ) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(data);
            return arrayList;
        }

        if(data < root.data) {

            ArrayList<Integer> leftArrayList = findPath(root.left, data);
            if(leftArrayList.size()!=0) {
                leftArrayList.add(root.data);
            }
            return leftArrayList;

        }
        if( data > root.data ) {

            ArrayList<Integer> rightArrayList = findPath(root.right, data);
            if(rightArrayList.size()!=0) {
                rightArrayList.add(root.data);
            }
            return rightArrayList;
        }
        return new ArrayList<Integer>();



    }

    public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b){

        if(root==null) {
            return -1;
        }
        if(a < root.data && b < root.data ) {
            return lcaInBST(root.left, a, b);
        }
        if(a>root.data && b > root.data) {
            return lcaInBST(root.right, a, b);
        }
        if(root.data == a || root.data == b) {
            return root.data;
        }
        int leftLca = lcaInBST(root.left, a, b);
        int rightLca = lcaInBST(root.right, a, b);
        if(leftLca==-1 && rightLca==-1) {
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


    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=takeInput();
        //System.out.println(Search(root,4));
        printNodeFromK1ToK2(root,6,10);
    }
}
