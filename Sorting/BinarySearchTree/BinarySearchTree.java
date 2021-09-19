public class BinarySearchTree {
    class Node{
        int key;
        Node left,right;

        public Node(int item){
            key = item;
            left = right =null;
        }
    }
    
    //root of BST
    Node root;

    //constrcutor
    BinarySearchTree(){
        root = null;
    }

    public static void main(String args[]){
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
    }
}
