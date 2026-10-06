import java.util.Scanner;

public class BinaryTreeUse {

    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        int rootData;
        System.out.println("Enter root data");
        rootData=s.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        root.left=takeInput(s);
        root.right=takeInput(s);

        return root;
    }

    public static void print(BinaryTreeNode<Integer> root){
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

        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> root2=new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> root3=new BinaryTreeNode<>(3);

//        root.left=root2;
//        root.right=root3;

        Scanner s=new Scanner(System.in);
        BinaryTreeNode<Integer> root=takeInput(s);
        print(root);
    }
}
