public class BSTuse {
    public static void main(String[] args) {
        BST bst=new BST();

        bst.insertData(10);
        bst.insertData(20);
        bst.insertData(40);
        bst.insertData(60);
        bst.insertData(5);
        bst.insertData(13);
        bst.printTree();
        bst.deleteData(10);
        bst.printTree();
    }
}
